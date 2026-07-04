# Predicitng Constructors for your Classes

### Defining a Constructor

- A class contains constructors that are invoked to create objects from the class blueprint. Constructor declarations look like method declarations- except that they use the name of the class and have no return type.

```java
public Bicycle(int startCadence,int startSpeed,int startGear){
    gear=startGear;
    cadence=startCadence;
    speed=startSpeed;
}
```
- A no-argument constructor can also be created. Both constructors could have been declared in the class because they have different argument lists. As with methods, the java platform differentiates constructors on the basis of the number of arguments in the list and their types.

- We don't require to provide any constructors for our class, but we must be careful when doing this. The compiler automatically provides a no-argument, default constructor for any class without constructors. This default constructor will call the no-argument constructor of the superclass. 

- If our class has no explicit superclass, then it has an implicit superclass of object, which does have a no-argument constructor.

