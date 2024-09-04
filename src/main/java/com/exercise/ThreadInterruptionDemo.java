package com.exercise;

class ThreadInterruptionDemo {

    public void runDemo() {
        Thread thread = new Thread(new InterruptibleTask());
        thread.start();

        try {
            Thread.sleep(1000); // Allow some time for the thread to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt(); // Interrupt the thread
    }

    class InterruptibleTask implements Runnable {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(2000); // Simulate work
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted during sleep.");
                    Thread.currentThread().interrupt(); // Preserve interruption status
                }
            }
            System.out.println("Thread has stopped due to interruption.");
        }
    }
}