package com.exercise;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

class ForkJoinDemo {

    private static final int THRESHOLD = 10;

    public void runDemo() {
        ForkJoinPool pool = new ForkJoinPool();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        SumTask task = new SumTask(numbers, 0, numbers.length);
        Integer result = pool.invoke(task);
        System.out.println("Sum of numbers from 1 to 100 is: " + result);
    }

    static class SumTask extends RecursiveTask<Integer> {
        private final int[] numbers;
        private final int start;
        private final int end;

        SumTask(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= THRESHOLD) {
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += numbers[i];
                }
                return sum;
            } else {
                int middle = (start + end) / 2;
                SumTask leftTask = new SumTask(numbers, start, middle);
                SumTask rightTask = new SumTask(numbers, middle, end);
                invokeAll(leftTask, rightTask);
                return leftTask.join() + rightTask.join();
            }
        }
    }
}