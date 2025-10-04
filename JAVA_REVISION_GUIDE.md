# COMPREHENSIVE JAVA REVISION GUIDE

## Table of Contents
1. Variables and Data Types
2. Operators
3. Conditional Statements
4. Loops
5. Pattern Printing
6. Functions/Methods
7. Arrays
8. 2D Arrays
9. Strings
10. Bitwise Operations
11. Object-Oriented Programming (OOP)
12. Recursion
13. Sorting Algorithms
14. Problem Solving Examples

---

## 1. VARIABLES AND DATA TYPES

### Core Concepts:
- **Variables**: Named memory locations to store values
- **Data Types**: Define the type of data a variable can hold
- **Primitive Data Types**: byte, short, int, long, float, double, char, boolean

### Examples:
```java
byte b = 12;          // 8-bit integer (-128 to 127)
short s = 32767;      // 16-bit integer
int age = 25;         // 32-bit integer
long bigNum = 1500093887L;  // 64-bit integer
float price = 10.3466f;     // 32-bit floating point
double precise = 21.75528;  // 64-bit floating point
char grade = 'A';           // Single character
boolean isActive = true;    // Boolean value (true/false)
```

### Key Points:
- Always initialize variables before using them
- Choose appropriate data types based on range requirements
- Use final keyword for constants

---

## 2. OPERATORS

### Arithmetic Operators: +, -, *, /, %
```java
int a = 10, b = 5;
System.out.println("a + b = " + (a + b));
System.out.println("a % b = " + (a % b)); // Modulo (remainder)
```

### Unary Operators: ++, --
```java
int a = 10;
int b = a++; // Post-increment: b=10, a=11
int c = ++a; // Pre-increment: a=12, c=12
```

### Relational Operators: ==, !=, <, >, <=, >=
### Logical Operators: &&, ||, !
### Assignment Operators: =, +=, -=, *=, /=, %=

### Key Points:
- Remember operator precedence: *, /, % before +, -
- Short-circuit evaluation with && and ||

---

## 3. CONDITIONAL STATEMENTS

### If-Else
```java
if (condition) {
    // code block
} else if (anotherCondition) {
    // code block
} else {
    // code block
}
```

### Switch Statement
```java
switch (value) {
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    default:
        System.out.println("Other");
}
```

### Ternary Operator
```java
int result = (condition) ? valueIfTrue : valueIfFalse;
String type = (number % 2 == 0) ? "even" : "odd";
```

### Key Points:
- Use if-else for complex conditions
- Use switch for discrete values
- Always include break in switch (unless fall-through is intended)

---

## 4. LOOPS

### For Loop
```java
for (initialization; condition; increment) {
    // code block
}

// Example: Print 1 to 10
for (int i = 1; i <= 10; i++) {
    System.out.print(i + " ");
}
```

### While Loop
```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}
```

### Do-While Loop
```java
int n = 1;
do {
    System.out.println("hello");
    n++;
} while (n <= 10);
```

### Loop Control: break, continue
- `break`: Exits the loop completely
- `continue`: Skips current iteration, continues with next

### Key Points:
- For loop when you know iterations in advance
- While loop when condition is checked first
- Do-while loop guarantees at least one execution

---

## 5. PATTERN PRINTING

### Right Triangle
```java
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*\t");
    }
    System.out.println();
}
```
Output:
```
*
*   *
*   *   *
*   *   *   *
```

### Pyramid Pattern
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    // Print spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    // Print stars
    for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### Key Points:
- Use nested loops: outer for rows, inner for columns
- Calculate spaces and stars mathematically
- Pattern logic: row number often controls column count

---

## 6. FUNCTIONS/METHODS

### Method Declaration
```java
public static returnType methodName(parameterType parameterName) {
    // method body
    return value; // if return type is not void
}
```

### Examples:
```java
// Simple method without parameters
public static void printHello() {
    System.out.println("Hello, World!");
}

// Method with parameters and return value
public static int sum(int a, int b) {
    return a + b;
}

// Method with array parameter
public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) max = arr[i];
    }
    return max;
}
```

### Key Points:
- Methods promote code reusability and modularity
- Follow naming conventions: camelCase
- Consider method length - keep it focused on one task

---

## 7. ARRAYS

### Array Declaration and Initialization
```java
// Declaration
int[] numbers = new int[5];           // Array of 5 integers
int[] marks = {85, 90, 78, 92, 88}; // Initialize with values
int[] grades = new int[]{65, 70, 75}; // Alternative syntax
```

### Array Operations
```java
int[] arr = {1, 2, 3, 4, 5};
int length = arr.length; // Get array length

// Traversing array
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}

// Enhanced for loop (for-each)
for (int element : arr) {
    System.out.print(element + " ");
}
```

### Common Array Operations
```java
// Find maximum
public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) max = arr[i];
    }
    return max;
}

// Linear search
public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == key) return i;
    }
    return -1; // Not found
}

// Reverse array
public static void reverse(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++; end--;
    }
}
```

### Key Points:
- Arrays have fixed size once created
- Index starts from 0
- Always check bounds to avoid ArrayIndexOutOfBoundsException

---

## 8. 2D ARRAYS

### Declaration and Initialization
```java
// Declaration
int[][] matrix = new int[3][4];           // 3x4 matrix
int[][] grid = {{1,2,3}, {4,5,6}, {7,8,9}}; // Initialize with values
```

### Traversal
```java
// Using nested for loops
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

// Using enhanced for loops
for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

### Key Points:
- 2D arrays are arrays of arrays
- First index is rows, second is columns
- Each row can potentially have different lengths (jagged arrays)

---

## 9. STRINGS

### String Declaration and Methods
```java
String str1 = "Hello";
String str2 = new String("World");

// Important methods
str1.length();              // Length of string
str1.charAt(0);             // Character at index 0
str1.substring(0, 5);       // Substring from index 0 to 4
str1.equals(str2);          // Compare content
str1.equalsIgnoreCase(str2); // Compare ignoring case
str1.indexOf('l');          // Index of first occurrence
str1.toUpperCase();         // Convert to uppercase
str1.toLowerCase();         // Convert to lowercase
str1.trim();                // Remove leading/trailing spaces
str1.replace('o', 'a');     // Replace characters
```

### StringBuilder (for mutable strings)
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");        // Add to end
sb.insert(5, " Beautiful"); // Insert at position
sb.reverse();               // Reverse string
sb.delete(0, 5);            // Delete characters
```

### Key Points:
- Strings are immutable in Java
- Use StringBuilder for frequent modifications
- String comparison uses equals(), not ==

---

## 10. BITWISE OPERATIONS

### Bitwise Operators
```java
int a = 5;   // Binary: 101
int b = 3;   // Binary: 011

int and = a & b;     // AND: 101 & 011 = 001 = 1
int or = a | b;      // OR:  101 | 011 = 111 = 7
int xor = a ^ b;     // XOR: 101 ^ 011 = 110 = 6
int not = ~a;        // NOT: ~101 = ...1010 = -6
int leftShift = a << 1;  // Left shift: 101 << 1 = 1010 = 10
int rightShift = a >> 1; // Right shift: 101 >> 1 = 010 = 2
```

### Common Bitwise Techniques
```java
// Check if number is even/odd
boolean isEven = (n & 1) == 0;

// Turn off the rightmost set bit
int turnedOff = n & (n - 1);

// Check if a number is a power of 2
boolean isPowerOf2 = (n > 0) && ((n & (n - 1)) == 0);
```

---

## 11. OBJECT-ORIENTED PROGRAMMING (OOP)

### Classes and Objects
```java
class Student {
    // Attributes
    private String name;
    private int age;
    private String course;
    
    // Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

// Creating objects
Student student1 = new Student("Alice", 20, "Computer Science");
student1.displayInfo();
```

### Four Pillars of OOP

#### 1. Encapsulation
```java
// Using private attributes and public methods
class BankAccount {
    private double balance; // Hidden from outside world
    
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    
    public double getBalance() {
        return balance;
    }
}
```

#### 2. Inheritance
```java
class Vehicle {
    protected String brand;
    public void start() { System.out.println("Vehicle started"); }
}

class Car extends Vehicle {
    private int doors;
    @Override
    public void start() { System.out.println("Car started with key"); }
}
```

#### 3. Polymorphism
```java
class Shape {
    public void draw() { System.out.println("Drawing shape"); }
}

class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Drawing circle"); }
}

Shape s = new Circle(); // Can hold any subclass object
s.draw(); // Calls overridden method (dynamic binding)
```

#### 4. Abstraction
```java
abstract class Animal {
    abstract void makeSound(); // Must be implemented by subclasses
    
    public void sleep() { System.out.println("Animal sleeps"); } // Concrete method
}

class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Woof!"); }
}
```

### Key Points:
- OOP promotes code reusability and maintainability
- Use access modifiers: private, protected, public
- Follow naming conventions: PascalCase for classes, camelCase for methods/variables

---

## 12. RECURSION

### Recursion Basics
```java
// Base case + Recursive case
public static int factorial(int n) {
    if (n == 0) return 1;         // Base case
    return n * factorial(n - 1);  // Recursive case
}

public static int fibonacci(int n) {
    if (n <= 1) return n;         // Base cases: f(0)=0, f(1)=1
    return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
}
```

### Recursion vs Iteration
- **Recursion**: Elegant, intuitive, but can cause stack overflow
- **Iteration**: More memory efficient, but code can be more complex
- Choose based on the problem - some problems are naturally recursive

### Key Points:
- Every recursive function needs a base case to stop
- Recursion uses the call stack
- Time complexity is often exponential for naive recursive solutions

---

## 13. SORTING ALGORITHMS

### Bubble Sort
```java
public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

### Selection Sort
```java
public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        // Swap
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
```

### Insertion Sort
```java
public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
```

### Key Points:
- Bubble Sort: O(n²) - simple but inefficient
- Selection Sort: O(n²) - finds minimum in each pass
- Insertion Sort: O(n²) - good for small/nearly sorted arrays

---

## 14. PROBLEM SOLVING EXAMPLES

### Find Duplicates in Array
```java
public static boolean hasDuplicates(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) return true;
        }
    }
    return false;
}
```

### Binary Search (on sorted array)
```java
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2; // Prevents overflow
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```

### Prime Number Check
```java
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
}
```

---

## QUICK REFERENCE

### Common Import Statements
```java
import java.util.*;    // Scanner, ArrayList, HashMap, etc.
import java.io.*;      // File operations
```

### Scanner for Input
```java
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
double d = sc.nextDouble();
String str = sc.nextLine();
sc.close();
```

### Common Mistakes to Avoid
1. Array index out of bounds
2. Forgetting to close Scanner
3. Using == instead of equals() for String comparison
4. Infinite loops (missing increment or wrong condition)
5. Not handling base cases in recursion
6. Using == for comparing objects

### Best Practices
- Use meaningful variable and method names
- Keep methods focused on a single task
- Comment complex logic
- Handle edge cases
- Use appropriate data types for the range of values

---

This comprehensive revision guide covers all major Java concepts you've learned, from basic variables to OOP principles. Review this systematically and practice coding examples to reinforce your understanding!