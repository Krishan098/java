```java
/**
 * These are how documentation comments are done.
 */ 
class Hello{
    public static void main(String [] args){
        System.out.println("Hello World!");
    }
}
```

### Source code comments

- The following bold text defines the comments.

- Comments are ignored by the compiler but are useful to other programmers.

- Java supports 3 types of comments:
    - /* text */ 
        The compiler ignores everything from /*to */.
    - /** documentation */
        This indicates a documentation comment(doc comment). The javadoc tool uses doc comments when preparing automatically generating doc.
    - // text
        The compiler ignores everything from // to the end of the line.

### The Hello Class Definition

- The most basic form of a class defintion is:

```java
class name{
    ....
}
```

- The *keyword* class begins the class definition for a class named name, and the code for each class appears between the opening and closing curly brace. 

### The main method

- Every application in java must contain a main method whose signature is:

```java
public static void main(String[] args)
```
- the modifiers public and static can be written in any order but the convention is to use public static as shown above. we can name the argument anything we want.

- The main method is the entry point to the application and will subsequently invoke all the other methods.

- The main method in this example accepts a single argument: an array of elements of type String.

- This array is the mechanism through which the runtime system passes information to your application. For example:

```java
java MyApp arg1 arg2
```

- Each string in the array is called a *command-line argument*. Command-line arguments let users affect the operation of the application without recompiling it. 

