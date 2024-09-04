package com.exercise;

class DeadlockPreventionDemo {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void runDemo() {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock 2!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock1) { // Locking in the same order as t1
                System.out.println("Thread 2: Holding lock 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 2: Acquired lock 2!");
                }
            }
        });

        t1.start();
        t2.start();
    }
}