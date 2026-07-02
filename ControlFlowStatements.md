# Control Flow Statements

### The If-Then Statement

- The if-then statement is the most basic of all the control flow statements. It tells the program to execute a certain section of code only if a particular test evaluates to true. 

```java
void applyBrakes() {
    // the "if" clause: bicycle must be moving
    if (isMoving){
        // the "then" clause: decrease current speed
        currentSpeed--;
    }
}
```

- If this test evaluates to false, control jumps to the end of the if-then statement.

- In addition, the opening and closing braces are optional, provided that the "then"  clause contains only one statement.

### The If-Then-Else Statement

- The if-then-else statement provides a secondary path of execution when an "if" clause evaluates to false. 

```java
void applyBrakes() {
    if (isMoving) {
        currentSpeed--;
    } else {
        System.err.println("The bicycle has already stopped!");
    }
}
```
```java
class IfElseDemo {
    public static void main(String[] args) {

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        IO.println("Grade = " + grade);
    }
}
```

- Once a condition is satisfied,the appropriate statements are executed and the remaining conditions are not evaluated.

### The While and Do-While Statements

- The while statement continually executes a block of statements while a particular condition is true. It's syntax can be given by:

```java
while(expression){
    statement(s)
}
```
- The while statement evaluates expression, which must return a boolean value. If the expression evaluates to true, the while statement executes the statement(s) in the while block. The while statement continues testing the expression and executing its block until the expression evaluates to false. 

- Without a terminating condition , the loop will run infinitely.

- There is a do-while loop too:

```java
do{
    statement(s)
}
while(expression);
```

- The difference between do-while and while is that the do-while evaluates its expression at the bottom of the loop instead of the top. Therefore the statement(s) in the do block are always executed at least once.

### The For Statement

- The for statement provides a compact way to iterate over a range of values.

```java
for(initialization;termination;increment){
    statement(s);
}
```
- When using this version of the statement, keep in mind that:
    - The initialization expression initializes the loop; it is executed once, as the loop begins.
    - When the termination expression evaluates to false, the loop terminates.
    - The increment expression is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value.
```java
class ForDemo {
    public static void main(String[] args){
         for(int i = 1; i < 11; i++){
              IO.println("Count is: " + i);
         }
    }
}
```

- The code declares a variable within the initializtion expression. The scope of this variable extends from its declaration to the end of the block governed by the for statement, so it can be used in the termination and increment expression as well. If the variable that controls a for statement is not needed outside of the loop, it is best to declare the variable in the initialization expression. The names i,j,k are often used to control for loops; declaring them within the initialization expression limits their life span and reduces errors.

- The for statement also has another form designed for iteration through Collections and arrays. This form is sometimes referred to as the enhanced for statement, and can be used to make our loops more compact and easy to read.

### The Break Statement

- The **break** statement has 2 forms: labeled and unalabeled. We can use an unlabeled break to terminate a for, while or do-while loop.

- An unlabeled break statement terminates the innermost switch, for, while or do-while statement, but a labeled break terminates an outer statement. 

- The break statement terminates the labeled statement; it doesnot transfer the flow of control to the label. Control flow is transferred to the statement immediately following the labeled statement.

### The Continue Statement

- The continue statement skips the current iteration of a for, while or do-while loop. The unlabeled form skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop. 

- A labeled continue statement skips the current iteration of an outer loop marked with the given label.

### The Return Statement

- The next branching statements is the return statement. The return statement exits from the current method, and control flow returns to where the method was invoked.The return statement has two forms: one that returns a value and one that doesnot. To return a value, simply put the value after the return keyword.

- The data type of the returned value must match the type of the method's declared return value. When a method is declared void, use the form of return that doesn't return a value.

### The Yield Statement

- The last branching statement is the yield statement. The yield statement exits  from the current switch expression it is in. A yield statement is always followed by an expression that must profuce a value. This expression must not be void. The value of this expression is the value produced by the enclosing switch expression.