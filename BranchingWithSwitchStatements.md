### Using Switch Statements to Control the Flow of our Program

- The switch statement is one of the five control statements available in the language. It allows for any number of execution path. A switch statement takes a selector variable as an argument and uses the value of this variable to choose the path that will be executed.

- We must choose the type of the selector variable among the following types:
    - byte,short,char and int primitive data types
    - character, Byte, Short and Integer wrapper types
    - enumerated types
    - The String type

- boolean,long,float and double can't be used for the type of the selector variable.

```java
int quarter=...;
String quarterLabel=null;
switch(quarter){
    case 0: quarterLabel="Q1-Winter";
    break;
    case 1: quarterLabel="Q2-Spring";
    break;
    case 2: quarterLabel="Q3-Summer";
    break;
    case 3: quarterLabel="Q4-Summer";
    break;
    default: quarterLabel="Unknow quarter";
};
```

- The body of a switch statement is known as a switch block. A statement in the switch block can be labeled with one or more case or default labels. The switch statement evaluates its expression, then executes all statements that follow the matching case label.

- Each break statement terminates the enclosing switch statement. Control flow continues with the first statement following the switch block. The break statements are necessary because without them, statements in the switch blocks fall through. All statements after the matching case label are executed in sequence, regardless of the expression of subsequent case labels, until a break statement is encountered.

- The default section handles all the values that are not explicitly handled by one of the case sections.

```java
int month = 2;
int year = 2021;
int numDays = 0;

switch (month) {
    case 1: case 3: case 5:   // January March May
    case 7: case 8: case 10:  // July August October
    case 12:
        numDays = 31;
        break;
    case 4: case 6:   // April June
    case 9: case 11:  // September November
        numDays = 30;
        break;
    case 2: // February
        if (((year % 4 == 0) && 
             !(year % 100 == 0))
             || (year % 400 == 0))
            numDays = 29;
        else
            numDays = 28;
        break;
    default:
        IO.println("Invalid month.");
        break;
}
```
### Choosing between Switch statements and if-then-else statements

- An if-then-else statement can test expressions based on ranges of values or conditions, whereas a switch statement tests expressions based only on a single integer, enumerated value, or String object.

### Using String as a Type for the Case labels

- The String in the switch expression is compared with the expressions associated with each case label as if the String.equals() method were being used.

### Null selector variables

- The selector variable of a switch statement can be an object, so this object can be null.

- In this case the switch statement will throw a NullPointerException.
