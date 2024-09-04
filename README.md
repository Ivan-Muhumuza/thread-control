[loom-video-link](https://www.loom.com/share/7ceb1d8cadfe40b4898501448994f477)

# Multithreading Lab

This project demonstrates various multithreading concepts in Java, including thread interruption, the Fork/Join framework, and deadlock scenarios with solutions for deadlock prevention.

## Project Structure

- `Main.java`: The entry point of the application. It runs demos for thread interruption, Fork/Join framework, deadlock scenarios, and deadlock prevention.
- `ThreadInterruptionDemo.java`: Contains examples of thread interruption using the `interrupt()` method.
- `ForkJoinExample.java`: Implements a Fork/Join task to demonstrate parallel processing.
- `DeadlockDemo.java`: Shows an example of a deadlock scenario with two threads.
- `DeadlockPreventionDemo.java`: Demonstrates techniques for preventing deadlocks by locking resources in a consistent order.

## Running the Application

To run the application, compile and execute the `Main.java` file. It will sequentially demonstrate the following:

1. **Thread Interruption**: Shows how to interrupt a running thread and handle the interruption.
2. **Fork/Join Framework**: Uses the Fork/Join framework to compute the sum of an array of integers in parallel.
3. **Deadlock Scenarios**: Demonstrates a classic deadlock situation where two threads try to acquire locks in different orders.
4. **Deadlock Prevention**: Illustrates how to prevent deadlocks by ensuring that threads acquire locks in a consistent order.

### Commands

To compile and run the project:

```sh
$ javac Main.java ThreadInterruptionDemo.java ForkJoinExample.java DeadlockDemo.java DeadlockPreventionDemo.java
```
```sh
$ java Main
```
