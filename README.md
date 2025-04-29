# Java Threads Demonstration 🧵

A comprehensive demonstration of different thread implementation approaches in Java, showing concurrent execution of multiple tasks.

## Features ✨

- Four different thread implementation techniques:
  - Extending `Thread` class
  - Implementing `Runnable` interface
  - Anonymous class implementation
  - Lambda expression (Java 8+)
- Concurrent execution demonstration
- Graceful interruption handling
- Number, character, and mathematical operations in parallel

## Requirements 📋
- Java JDK 8+ (for lambda support)
- Maven/Gradle (optional)

## 🚀 Running the Program

1. **Compile the code**:
   ```bash
   javac JavaThreadsDemo.java

2. **Execute the program**:
   ```bash
   java JavaThreadsDemo

## 🧩 Code Structure

### Thread Implementations

| Implementation Type       | Class/Method                | Output Range             | Delay  |
|---------------------------|-----------------------------|--------------------------|--------|
| **Extends Thread**        | `MyThread1`                 | Numbers 1-5              | 500ms  |
| **Implements Runnable**   | `MyThread2`                 | Characters A-E           | 500ms  |
| **Anonymous Class**       | `startAnonymousThread()`    | Numbers 6-10             | 400ms  |
| **Lambda Expression**     | `startRunnableLambda()`     | Squares of 1-5           | 400ms  |

### Key Differences
| Aspect                | Extends Thread           | Implements Runnable      | Anonymous Class         | Lambda Expression       |
|-----------------------|--------------------------|--------------------------|-------------------------|-------------------------|
| **Implementation**    | Inheritance              | Interface                | Inline class definition | Functional programming  |
| **Reusability**       | Limited (single use)     | High                     | Single-use              | Single-use              |
| **Thread Start**      | `thread.start()`         | `new Thread(runnable)`   | Direct instantiation    | Lambda syntax           |
| **Code Verbosity**    | Moderate                 | Moderate                 | High                    | Low                     |

## Results
![image](https://github.com/user-attachments/assets/4089dc51-3f7d-42c9-89d2-12bc274c537a)
