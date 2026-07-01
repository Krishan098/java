### Expressions

- An expression is a construct made up of variables, operators and method invocations, which are constructed according to the syntax of the language, that evaluates to a single value. 

```java
int cadence = 0;
anArray[0] = 100;
IO.println("Element 1 at index 0: " + anArray[0]);

int result = 1 + 2; // result is now 3
if (value1 == value2)
    IO.println("value1 == value2");
```

- The data type of the value returned by an expression depends on the elements used in the expression. The expression cadence=0 returns an int because the assignment operator returns a value of the same data type as its left-hand operand; in this case, cadence is an int.

- We can construct compound expressions from various smaller expressions as long as the data type required by one part of the expression matches the data type of the other.

### Floating Point Arithmetic

- It is a special world in which common operations may behave unexpectedly.


### Statements

- Statements are roughly equivalent to sentences in natural languages. A statement forms a complete unit of execution. The following types of expressions can be made into a statement by terminating the expression with a semicolon(;).

    - Assignment expressions
    - Any use of ++ or --
    - Method invocations
    - Object creation expressions
    - Such statements are called expression statements.

```java
// assignment statement
aValue = 8933.234;

// increment statement
aValue++;

// method invocation statement
IO.println("Hello World!");

// object creation statement
Bicycle myBike = new Bicycle();
```
- In addition to expression statements, there are two other kinds of statements: declaration statements and control flow statements. A declaration statement declares a variable. We have seen many examples of declaration statements already:

```java
double aValue=8933.234;
```

- Finally, control flow statements regulate the order in which statements get executed. You will learn about control flow statements in the next section, Control Flow Statements.

### Blocks

- A block is a group of zero or more statements between balanced braces and can be used anywhere in a single statement is allowed.