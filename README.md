 # java-by-zahed ☕

> Include all Java basics, OOP, and mini projects.

---
## 📁 01.basics (Day 1)
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

📁 02.Controlflow(Day 2)
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
##📁 03.Mini-projects (Day 4)

## Mini Projects: Random Guessing Game & Dice Roller 🎮🎲

Today I built two beginner-friendly mini projects to apply core Java skills:

### Concepts Practiced:
- `Random` class from `java.util` for number generation
- `Scanner` class for user input
- `if-else`, break, and replay mechanics

---

## 📂 Files

| File Name           | Description                                          |
|--------------------|------------------------------------------------------|
| `RandomGuess.java` | A guessing game where the user has limited chances to guess a randomly generated number |
| `diceroller.java`  | Simulates a dice roll, giving a random number between 1 and 6 |

---

## 🧠 Skills Gained
- Applied real logic with conditions and loops
- Understood how to write interactive CLI-based Java programs
- Built confidence through hands-on mini projects

---
# 📁 04.Arrays (Day 5)

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


# 📁 05.Functions (Day 5)
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

  

# 📁 06.Strings (Day 6)

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

## 07.OOP_Basics -  (Day 7)

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

## 📅 Day 9: Java OOP – Inheritance
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


**MD Zahed Hussain**  
🎓 BCA Final Year | 👨‍💻 Java Learner | 🚀 SDE Aspirant

Author -MD Zahed Hussain
