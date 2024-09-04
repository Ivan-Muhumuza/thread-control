package com.exercise;

public class Main {

    public static void main(String[] args) {
        // Demonstrate thread interruption
        System.out.println("Demonstrating thread interruption:");
        ThreadInterruptionDemo threadInterruptionDemo = new ThreadInterruptionDemo();
        threadInterruptionDemo.runDemo();

        // Demonstrate Fork/Join framework
        System.out.println("\nDemonstrating Fork/Join framework:");
        ForkJoinDemo forkJoinExample = new ForkJoinDemo();
        forkJoinExample.runDemo();

        // Demonstrate deadlock scenarios
        System.out.println("\nDemonstrating deadlock scenarios:");
        DeadlockDemo deadlockDemo = new DeadlockDemo();
        deadlockDemo.runDemo();

        // Demonstrate deadlock prevention
        System.out.println("\nDemonstrating deadlock prevention:");
        DeadlockPreventionDemo deadlockPreventionDemo = new DeadlockPreventionDemo();
        deadlockPreventionDemo.runDemo();
    }
}