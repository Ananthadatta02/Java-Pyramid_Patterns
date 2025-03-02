# Java Pyramid Number Pattern

## Description
This repository contains a Java program that prints a pyramid number pattern using nested loops. The program effectively manages spacing, number increments, and decrements to create a symmetrical pyramid structure. It is useful for understanding nested loops, conditionals, and number formatting in Java.

## Code Explanation

### Variables Used:
- `a`: Tracks the number to be printed.
- `space`: Controls the leading spaces for pyramid alignment.
- `num`: Determines the number of values printed in each row.

### Loop Breakdown:

#### Outer Loop (Row Control)
```java
for(int i=1; i<=4; i++)
```
- Runs **4 times** to print 4 rows.
- Controls row-wise execution of space printing and number pattern printing.

#### First Inner Loop (Leading Spaces)
```java
for(int j=1; j<=space; j++)
```
- Prints leading spaces to align the pyramid.
- `space` starts at 3 and decreases after each row (`space--`).

#### Second Inner Loop (Number Printing - Ascending Order)
```java
for(int j=1; j<=num; j++)
```
- Prints the left side of the pyramid.
- `a++` is used to increment and print numbers.

#### Third Inner Loop (Number Printing - Descending Order)
```java
for(int j=2; j<=num; j++)
```
- Handles printing of the **right side** of the pyramid.
- Uses `if(i<=2)` to determine decrement behavior:
  - For first two rows, `a` is decremented (`--a`) to print correct mirrored numbers.
  - For lower rows, the value is maintained as `a`.

#### Variable Updates After Each Row
```java
a++;
space--;
num++;
a=1;
```
- `a++` ensures correct number sequence for the next row.
- `space--` reduces leading spaces for proper pyramid shape.
- `num++` increases printed numbers per row.
- `a=1;` resets `a` for the next row’s starting number.

## Example Output
```
   1
  121
 12321
1234321
```

## Concepts Covered
- **Nested Loops**: For space and number printing.
- **Conditionals (if-else)**: For number decrements in symmetry.
- **Increment & Decrement Operators**: To manage number sequencing.
- **Printing Statements**: `System.out.print()` and `System.out.println()`.

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/Ananthadatta02/Java-Pyramid_Patterns.git
   ```
