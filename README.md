 # java-by-zahed ☕

> Include all Java basics, OOP, and mini projects.

---
## 📁 01.basics 
## Variables, User Input, Arithmetic Operators

This repo contains basic Java programs that demonstrate:

- Declaring and printing variables and data types
- Taking input from the user using `Scanner`
- Performing arithmetic operations

---

## 📂 Files

| File Name         | Description                                         |
|------------------|-----------------------------------------------------|
| `basic.java`     | Shows different data types                          |
| `User1.java`     | Reads user input from the console                   |
| `Arithmetic.java`| Performs addition, subtraction, multiplication, division, and modulus |

# 📁 02.Controlflow
## 📅 Java Day 2 – If-Else, Nested If-Else, Switch, Ternary Operator

This day covers Java conditional control structures:

- `if-else` statement
- Nested `if-else` logic
- `switch` statement for multi-way decisions
- Ternary operator for compact conditions

---

## 📂 Files

| File Name           | Description                                     |
|--------------------|--------------------------------------------------|
| `if_else.java`     | Basic usage of if-else condition                 |
| `nestedif.java`    | Demonstrates nested if-else logic                |
| `switch_ex.java `  | Switch-case example with menu-based input        |
| `Ternary.java`     | Uses ternary operator for conditional assignment |

---
## 📅 Java Day 3 – Loops, Switch, Break, Nested Loops

This day focuses on Java looping constructs and flow control within loops:

- `for` loop
- `while` loop
- `do-while` loop
- `switch` with break statement
- Nested loops for pattern-based or multi-level logic

---
## 📂 Files

| File Name            | Description                                        |
|----------------------|----------------------------------------------------|
| `for_ex.java`        | Demonstrates counting with a `for` loop            |
| `while_ex.java`      | Uses `while` loop for conditional repetition       |
| `do_while.java`      | Executes block at least once using `do-while`      |
| `break_cont.java`    | `continue` statement with `break` to avoid fallthrough |
| `nested_loop.java`   | Example of nested loops (e.g., pattern printing)   |

---
---
# 📁 03.Mini-projects  

## Mini Projects: Random Guessing Game, Dice Roller & Slot Machine 🎮🎲🎰  

Today I built three beginner-friendly mini projects to apply and strengthen my core Java skills through fun and interactive programs.  

### Concepts Practiced:
- `Random` class from `java.util` for generating random numbers and symbols  
- `Scanner` class for handling user input  
- `if-else`, `while`, and `break` statements for game logic and replay features  
- Basic math operations for score and reward calculations  
- Modular code using methods for cleaner and reusable structure 

---

## 📂 Files

| File Name           | Description                                          |
|--------------------|------------------------------------------------------|
| `RandomGuess.java` | A guessing game where the user has limited chances to guess a randomly generated number |
| `diceroller.java`  | Simulates a dice roll, giving a random number between 1 and 6 |
| `SlotMachinegame .java`  | Spin the slots and match symbols to win coins|

---

## 🧠 Skills Gained
- Applied real logic with conditions and loops
- Understood how to write interactive CLI-based Java programs
- Built confidence through hands-on mini projects

---
# 📁 04.Arrays  

### 🔸 Topics Practiced:
- 1D Array declaration and initialization
- Taking array input using Scanner
- Finding maximum, minimum
- Reversing and summing array elements

---

### 📂 Files

| File Name             | Description                                     |
|----------------------|-------------------------------------------------|
| `ArrayInput.java`     | Takes array input using Scanner                |
| `SumOfArray.java`     | Calculates sum of all elements                 |
| `MaxMinInArray.java`  | Finds the max and min from an array            |
| `ReverseArray.java`   | Reverses the order of array elements           |

---

### 🧠 Concepts Used
- `for` loops
- `Scanner` class
- Array indexing
- Basic logic building


# 📁 05.Functions 
🔸 Topics Covered:
Method declaration and calling

Passing parameters and return types

Method Overloading

Recursion basics

Practice function-based problems

### 📂 Files:
| File                   | Description                                   |
| ---------------------- | --------------------------------------------- |
| `AddNumbers.java`      | Adds two numbers using a method               |
| `CheckEven.java`       | Checks if a number is even or odd             |
| `Factorial.java`       | Finds factorial using recursion               |
| `OverloadingDemo.java` | Demonstrates method overloading with examples |

  

# 📁 06.Strings  

### 🔸 Topics Covered:

- String declaration and initialization
- String methods: `length()`, `charAt()`, `equals()`, `concat()`, etc.
- Palindrome check using loop
- Practice string manipulation problems

---

### 📂 Files:

| File                  | Description                                 |
|------------------------|---------------------------------------------|
| `StringBasic.java`     | Basic string operations                     |
| `StringMethods.java`   | Demonstrates common string methods          |
| `StringProblems.java`  | Palindrome check with string reversal       |

<br>

## # 📁 07.OOP_Basics 

This folder contains an example of **Encapsulation** in Java using a `Student` class.  
Encapsulation is one of the 4 main pillars of Object-Oriented Programming (OOP) in Java.
---

## ✅ What is Encapsulation?

Encapsulation is the process of wrapping **data (variables)** and **code (methods)** into a single unit (class) and **restricting direct access** to some of the object's components.

This is done using:
- `private` access modifier for variables
- `public` getters and setters to access and modify those variables

---

## 📂 Files Included

### 🔸 `Student.java`
- Has private fields: `name`, `age`, `rollNumber`
- Uses `get` and `set` methods to control access
- Includes a method `displayInfo()` to show student details

### 🔸 `Main.java`
- Creates a `Student` object
- Sets values using setters
- Displays the values using the custom method


## 🔧 How to Run

```bash
javac Student.java Main.java
java Main
```
---
# 📁 08.OOP_Inheritance 

##  Java OOP – Inheritance
📘 Concepts Covered
What is Inheritance?
Inheritance allows one class (child/subclass) to acquire properties and behaviors (fields and methods) of another class (parent/superclass).

## Types of Inheritance

Single Inheritance – One child class inherits from one parent class.

Multilevel Inheritance – A class inherits from a child class, making a chain.

Hierarchical Inheritance – Multiple classes inherit from the same parent class.

# super Keyword

Used to refer to the parent class constructor or methods.

Useful for reusing parent logic in child classes.

# Method Overriding

When a subclass provides a specific implementation of a method that already exists in the parent class.

### 📂 Files:
| File          | Description                                   |
| ------------- | --------------------------------------------- |
| `Animal.java` | Base class with a `makeSound()` method        |
| `Dog.java`    | Subclass of `Animal`, overrides `makeSound()` |
| `Cat.java`    | Subclass of `Animal`, overrides `makeSound()` |
| `Main.java`   | Creates objects and demonstrates inheritance  |

---
#  📁 08.OOP_Polymorphism

This folder contains examples of **Polymorphism in Java**.  
Polymorphism means **many forms** – the same method behaves differently depending on the object.  

---

## 🔑 Key Concepts  
- **Compile-time Polymorphism (Method Overloading)** → Same method name, different parameter list.  
- **Run-time Polymorphism (Method Overriding)** → Child class provides its own implementation of a parent method.  
- **super keyword** → Used to call parent class methods from child class.  
- **@Override annotation** → Ensures that a method is correctly overriding a parent method.  

---

## 📂 Files  

| File                  | Description |
|------------------------|-------------|
| `Shape.java`           | Base class with `area()` method |
| `Circle.java`          | Overrides `area()` for Circle |
| `Rectangle.java`       | Overrides `area()` for Rectangle |
| `Main.java`            | Demonstrates **Run-time Polymorphism** using Shape reference |

--- 


# 📁 10.OOP_Abstraction  

This folder contains examples of **Abstraction in Java** using both **Abstract Classes** and **Interfaces**.  
Abstraction helps to **hide implementation details** and show only the **necessary functionality**.  

---

## 🔑 Key Concepts  
- **Abstract Class** → Can have abstract (no body) and normal methods (with body).  
- **Interface** → Only declares methods (blueprint). Implementation must be provided by classes.  
- **Real-life Example** → You know how to *drive a car* (accelerate, brake), but not how the *engine works internally*.  

---

## 📂 Files  

| File                  | Description |
|------------------------|-------------|
| `Shape.java`           | Abstract class containing abstract method `draw()` and concrete method `info()` |
| `Circle.java`          | Implements `draw()` method for Circle |
| `Rectangle.java`       | Implements `draw()` method for Rectangle |
| `Main.java`            | Demonstrates Abstraction with Abstract Class + Runtime Polymorphism |
| `AnimalInterface.java` | Interface declaring method `sound()` |
| `Dog.java`             | Implements `sound()` method for Dog |
| `Cat.java`             | Implements `sound()` method for Cat |
| `InterfaceMain.java`   | Demonstrates Abstraction using Interface |

---

## ⏳ Time Complexity  
Abstraction itself is a **concept**, not an algorithm.  
- Method calls → `O(1)` (constant time).  

---
# # 📁 12.Java Exception Handling

This folder contains examples demonstrating how **Java handles runtime errors** using exceptions.

## 🧩 Concepts Covered
- `try`, `catch`, and `finally` blocks  
- Handling built-in exceptions like `ArithmeticException`  
- Creating and throwing **custom exceptions**

## 📂 Files
1. **ExceptionHandlingDemo.java** – Demonstrates division by zero and use of `try-catch-finally`.
2. **CustomExceptionDemo.java** – Shows how to create and use a custom exception class.

## ⚙️ How to Run
```bash
javac ExceptionHandlingDemo.java
java ExceptionHandlingDemo

javac CustomExceptionDemo.java
java CustomExceptionDemo

```
# 📁 13.Wrapper 

## Wrapper Classes in Java 🧱  

Today I learned about **Wrapper Classes**, which are used to convert primitive data types into objects.  
They are helpful when working with collections and provide useful methods for data handling and conversions.  

### Concepts Practiced:
- Converting **primitive types → objects** (Boxing) and **objects → primitives** (Unboxing)  
- Using **Auto-boxing** and **Auto-unboxing** (automatic conversion by compiler)  
- Accessing constants like `Integer.MAX_VALUE`  
- Using wrapper methods such as `parseInt()`, `isDigit()`, and `valueOf()`  

### Example Practiced:
- `Integer`, `Double`, and `Character` classes  
- Demonstrated **manual boxing/unboxing** and **auto-boxing/unboxing**  
- Used static methods to perform conversions and checks
---

# 📁 14.Enums  

## Enums in Java 🧩  

Today I learned and practiced **Enums (Enumerations)** in Java — one of the most powerful and type-safe ways to define a fixed set of constants.  
Enums in Java are **special classes** that can have **fields, methods, and constructors**, not just names.

---

### 🔹 What Are Enums?

- Enums define a **set of named constants**.  
- Each constant in an enum is an **instance** of that enum type.  
- They provide **type safety** and are cleaner than using `public static final` constants.  

---

### Concepts Practiced:
- Defining Enums with fields, methods, and constructors  
- Using Enums in `switch` statements  
- Iterating through Enums with `.values()`  
- Enum methods like `.ordinal()`, `.name()`, `.valueOf()`  
- Implementing interfaces with Enums  

---

### 💻 Example Practiced:
- `EnumExample.java` → Enum with constructor, getter, and custom method  
- `EnumInterfaceExample.java` → Enum implementing an interface and used in a switch-case  

---

### ⚙️ How to Run
```bash
javac EnumExample.java
java EnumExample

javac EnumInterfaceExample.java
java EnumInterfaceExample

 ```



**MD Zahed Hussain**  
🎓 BCA Final Year | 👨‍💻 Java Learner | 🚀 SDE Aspirant

Author -MD Zahed Hussain
