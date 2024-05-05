# Multithreading
Multithreading is a powerful concept in Java that allows you to create programs that can ==execute multiple tasks concurrently.== This is achieved by ==dividing your program logic into smaller, independent units called threads.== These threads can then run seemingly simultaneously, making your program more responsive and efficient.
```java
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        // Start threads
        thread1.start();
        thread2.start();
        
        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        
        System.out.println("Main thread exiting.");
    }
}

```
## Threads:
- Threads are lightweight processes that share the same memory space of the main program.
- They provide a way to subdivide a program into multiple, concurrently executing tasks.

## Benefits of Multithreading:
- ==**Improved Responsiveness:**== Your program remains responsive even if one thread is blocked waiting for I/O operations (like reading from a file). Other threads can continue execution, keeping the user interface usable.
- ==**Efficient Resource Utilization:**== Multithreading allows you to leverage multiple cores or processors on a modern computer by running threads in parallel. This can significantly improve performance for CPU-bound tasks.
- ==**Simplified Complex Programs:**==By dividing complex tasks into smaller threads, you can improve code readability and maintainability.

## Creating Threads
1. **Extending the `Thread` Class:** You can create a subclass of the `java.lang.Thread` class and override its `run()` method. This method defines the code that the thread will execute.
2. **Implementing the `Runnable` Interface:** Another approach is to create a class that implements the `java.lang.Runnable` interface. This interface also has a `run()` method that needs to be implemented. You then create a `Thread` object, passing the `Runnable` instance to its constructor.

## Starting Threads:
Once you've created a thread object (using either of the approaches above), you call the `start()` method on the object. This method tells the Java runtime environment to schedule the thread for execution. It's important to note that `start()` doesn't guarantee immediate execution; the thread scheduling is handled by the operating system.

## Thread Lifecycle
A thread can be in different states throughout its lifecycle, such as:

- **New:** The thread object has been created but hasn't been started yet.
- **Runnable:** The thread is ready to be run by the operating system.
- **Running:** The thread is currently executing code.
- **Waiting:** The thread is waiting for an event to occur (like I/O completion) before it can proceed.
- **Blocked:** The thread is blocked due to resource contention (e.g., waiting to acquire a lock).
- **Terminated:** The thread has finished executing its code.

![](https://www.tutorialspoint.com/java/images/thread_life_cycle.jpg)
## Synchronization
When multiple threads access shared resources (like variables or objects) in a program, there's a potential for race conditions and data inconsistencies. To ensure thread safety and predictable behavior, Java provides mechanisms like synchronization blocks and locks to control access to shared resources.