# Creating Classes

### Declaring Classes

```java
class MyClass{
    //field,constructor, and method declarations
}
```
- This is a class declaration. The class body(the area between the braces) contains all the code that provides for the life cycle of the objects created from the class: constructors for initializing new objects, declarations for the fields that provide the state of the class and its objects, and methods to implement the behaviour of the class and its objects.

- We can also provide information such as the name of its superclass, whether it implements any interfaces and so on, at the start of the class declaration.

```java
class MyClass extends MySuperClass implements YourInterface{
    //field,constructor, and method declarations
}
```

- MyClass is a subclass of MySuperClass and it implements the YourInterface interface.

- We can also add modifiers like public or private at the very beginning. The modifiers public and private, which determine what other classes can access MyClass.

- In general, class declarations can include these components, in order:

    1. Modifiers such as public, private and a number of others.(However the private modifier can only be applied to Nested Classes.)
    2. The class name, with the initial letter capitalized by convention.
    3. The name of the class's parent(superclass), if any, preceded by the keyword extends. A class can only extend(subclass) one parent.
    4. A comma-separated list of interaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
    5. The class body, surrounded by braces,{}.

### Declaring Member Variables

- There are several kinds of variables:
    - Member variables in a class- These are called fields.
    - Variables in a method or block of code- these are called local variables.
    - Variables in method declarations- these are called parameters.
- Field declarations are composed of three components, in order:
    1. Zero or more-modifiers, such as public or private.
    2. The field's type.
    3. The field's name.

- The public keyword identifies these fields as public members, accessible by any object that can access the class.


### Controlling who has Access to a Member

- The first(left-most) modifier used lets us control what other classes have access to a member field. 

    - public modifier- the field is accessible from all classes.
    - private modifier - the field is accessible only within its own class.

- In the spirit of encapsulation, it is common to make fields private. This means that they can only be directly accessed from the Bicycle class. We still need access to these values, however. This can be done indirectly by adding public methods that obtain the field values for us:

```java
public class Bicycle{
    private int cadence;
    private int gear;
    private int speed;
    public Bicycle(int startCadence,int startSpeed, int startGear){
        gear=startGear;
        cadence=startCadence;
        speed=startSpeed;
    }
    public int getCadence(){
        return cadence;
    }
    public void setCadence(int newValue){
        cadence=newValue;
    }
    public int getGear(){
        return gear;
    }
    public void setGear(int newValue){
        gear=newValue;
    }
    public int getSpeed(){
        return speed;
    }
    public void applyBreak(int decrement){
        speed-=decrement;
    }
    public void speedUp(int increment){
        speed+=increment;
    }
}
```
### Setting the Type of a Variable

- All variables must have a type. We can use the primitive data types or the reference types such as strings, arrays, or objects.

### Naming a Variable

- All variables, whether they are fields, local variables or parameters, follow the same naming rules and conventions as discussed earlier.

- the first letter of a class name should be capitalized.

- The first(or only) word in a method name should be a verb.