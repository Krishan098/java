# Nested Classes

- Java allows us to define a class within another class. Such a class is called a nested class and is illustrated here:

```java
class OuterClass{
    ...
    class NestedClass{
        ...
    }
}
```

- Nested classes are divided into two categories: non-static and static. Non-static nested classes are called inner classes. Nested classes that are declared static are called static nested classes.
```java
class OuterClass{
    ...
    class InnerClass{
        ...
        static class StaticNestedClass{
            ...
        }
    }
}
```
- A nested class is a member of its enclosing class. Non-static nested classes(inner classes) have access to other members of the enclosing class, even if they are declared private. Static nested classes do not have access to other members of the enclosing class. As a member of the OuterClass, a nested class can be declared private, public, protected or package-private. 

##### Why Use Nested Classes?

- It is a way of logically grouping classes that are only used in one place: If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together. Nesting such "helper classes" makes their package more streamlined.

- It increases encapsulation: Consider 2 top-level classes, A and B, where B needs access to members of A that would otherwise be declared private. By hiding class B within class A, A's members can be declared private and B can access them. In addition, B itself can be hidden from the outside world.

- It can lead to more readable and maintainable code: Nesting small classes within top-level classes places the code closer to where it is used.

##### Inner Classes

- As with instance methods and variables, an inner class is associated with an instance of its enclosing class and has direct access to that object's methods and fields.

- Objects that are instances of an inner class exist within an instance of the outer class.

- An instance of the InnerClass can exist only within an instance of OuterClass and has direct access to the methods and fields of its enclosing instance.

- To instantiate an inner class, we must first instantiate the outerclass. Then, create thr inner object within the outer object.

```java
OuterClass outerObject= new OuterClass();
OuterClass.InnerClass innerObject=outerObject.new InnerClass();
```

##### Static Nested Classes

- As with class methods and variables, a static nested class is associated with its outer class. And like static class methods, a static nested class cannot refer directly to instance variables or methods defined in its enclosing class: it can use them only through an object reference. 

- A static nested class interacts with the instance members of its outer class (and other classes) just like any other top-level class. In effect, a static nested class is behaviorally a top-level class that has been nested in another top-level class for packaging convenience. 

```java
StaticNestedClass staticNestedObject= new StaticNestedClass();
```

- A static nested class interacts with the instance members of its outer class just like any other top-level class. The static nested class StaticNestedClass cannot directly access outerField because it is an instance variable of the enclosing class, outerClass. 

##### Shadowing

- If a declaration of a type(such as a member variable or a parameter name) in a particular scope(such as an inner class or a method definition) has the same name as another declaration in the enclosing scope, then the declaration shadows the declaration of the enclosing scope. We cannot refer to a shadowed declaration by its name alone.

##### Serialization

- Serialization of inner classes, including local and anonymous classes, is strongly discouraged. When the Java compiler compiles certain constructs, such as inner classes, it creates synthetic constructs;these are classes, methods,fields and other constructs that do not have a corresponding construct in the source code. Synthetic constructs enable Java compilers to implement new Java language features without changes to the JVM.

- However, synthetic constructs can vary among different Java compiler implementations,which means that .class files can vary among different implementations as well. Consequently, we may have compatibility issues if we serialize an inner class and then deserialize it with a different JRE implementation.

- We can use inner class to implement helper classes. To handle user interface events, we must know how to use inner classes, because the event-handling mechanism makes extensive use of them.

##### Local and Anonymous Classes

- There are two additional type of inner classes. We can declare an inner class within the body of a method. These classes are known local classes. We can also declare an inner class within the body of a method without naming the class. These are known as anonymous class.

##### Modifiers

- We can use the same modifiers for inner classes that we use for other members of the outer class. 

### Local Classes

- These are defined in a block, which is a group of zero or more statements between the balanced braces. We typically find local classes defined in the body of a method.

##### Declaring Local Classes

- We can define a local class inside any block. We can define a local class in a method body, a for loop, or an if clause.

##### Accessing Members of an Enclosing Class

- A local class has access to the members of its enclosing class. In addition, a local class has access to local variables. However, a local class can only access local variables that are declared final. When a local class accesses a local variable or a parameter of the enclosing block, it captures that variable or parameter. 

- A variable or parameter whose value is never changed after it is initialized is effectively final.

##### Local Classes are Similar to Inner Classes

- Local classes are similar to inner classes because they cannot define or declare any static members. Local classes in static methods can only refer to static members of the enclosing class. 

- Local classes are non-static because they have access to instance members of the enclosing block. Consequently, they cannot contain most kind of static declarations.

- We cannot declare an interface inside of a block; interfaces are inherently static. We cannot declare static initializers or member interfaces in a local class.

- A local class can have static members provided that they are constant variables. (A constant variable is a variable of primitive type or type String that is declared final and initialized with a compile-time constant expression. A compile-time constant expression is typically a string or an arithmetic expression that can be evaluated at compile time.)

### Anonymous Classes

- These enable us to make our code more concise. They enable us to declare and instantiate a class at the same time. They are like local classes except that they do not have a name. Use them if we need to use a local class only once.

##### Declaring Anonymous Classes

- While local classes are declarations, anonymous classes are expressions, which means that we define the class in another expression.

##### Syntax of Anonymous Classes

- The syntax of an anonymous class expression is like the invocation of a constructor, except that there is a class definition contained in a block of code.

- The anonymous class expression consists of the following:

    - The new operator
    - The name of an interface to implement or a class to extend. In this example, the anonymous class is implementing the interface HelloWorld.
    - Parentheses that contain the arguments to a constructor, just like a normal class instance creation expression. Note: When you implement an interface, there is no constructor, so you use an empty pair of parentheses, as in this example.
    - A body, which is a class declaration body. More specifically, in the body, method declarations are allowed but statements are not.
    - Because an anonymous class definition is an expression, it must be part of a statement. In this example, the anonymous class expression is part of the statement that instantiates the frenchGreeting object. (This explains why there is a semicolon after the closing brace.)


##### Accessing Local Variables of the Enclosing Scope, and Declaring and Accessing Members of the Anonymous Class

- Like local classes, anonymous classes can capture variables; they have the same access to local variables of the enclosing scope:

    - An anonymous class has access to the members of its enclosing class.
    - An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final.
    - Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other declarations in the enclosing scope that have the same name. See Shadowing for more information.

- Anonymous classes also have the same restrictions as local classes with respect to their members:

    - You cannot declare static initializers or member interfaces in an anonymous class.
    - An anonymous class can have static members provided that they are constant variables.

- Note that you can declare the following in anonymous classes:

    - Fields
    - Extra methods (even if they do not implement any methods of the supertype)
    - Instance initializers
    - Local classes

- However, you cannot declare constructors in an anonymous class.