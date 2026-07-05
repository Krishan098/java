# Calling Methods and Constructors

### Passing Information to a Method or a Constructor

- The declaration for a method or a constructor declares the number and the type of the arguments for that method or constructor. For example, the following is a method that computes the monthly payments for a home loan, based on the amount of the loan, the interest rate, the length of the loan(the number of periods), and the future value of the loan:

```java
public double computePayment(double loanAmt, double rate,double futureValue, int numPeriods){
    double interest=rate/100.0;
    double partial1=Math.pow((1+interest),-numPeriods);
    double denominator=(1-partial1)/interest;
    double answer=(-loanAmt/denominator)-((futureValue*partial1)/denominator);
    return answer;
}
```

- This method has four parameters: the loan amount, the interest rate, the future value and the number of periods. The first three are double-precision floating point numbers, and the fourth is an integer. The parameters are used in the method body and at runtime will take on the values of the arguments that are passed in.

- Parameters refer to the list of variables in a method declaration. Arguments are the actual values that are passed in when the method is invoked. When we invoke a method, the arguments used must match the declaration's parameters in type and order.

### Parameter Types

- We can use any data type for a parameter of a method or a constructor. This includes primitive data types, such as doubles, floats and integers as we saw in the computePayment() method, and reference data types, such as objects and arrays.

### Arbitrary number of Arguments

- We can use a construct called varargs to pass an arbitrary number of values to a method. We use varargs when we do not know how many of a particular type of argument will be passed to the method.It is a shortcut to creating an array manually.

- To use varargs, we follow the type of the last parameter by an ellipsis(three dots,...), then a space and the parameter name. The method can then be called with any number of parameters, including none.

```java
public Polygon polygonFrom(Point... corners) {
    int numberOfSides = corners.length;
    double squareOfSide1, lengthOfSide1;
    squareOfSide1 = (corners[1].x - corners[0].x)
                     * (corners[1].x - corners[0].x) 
                     + (corners[1].y - corners[0].y)
                     * (corners[1].y - corners[0].y);
    lengthOfSide1 = Math.sqrt(squareOfSide1);

    // more method body code follows that creates and returns a 
    // polygon connecting the Points
}
```

- The method can be called either with an array or with a sequence of arguments. The code in the method body will treat the parameter as an array in either case.

### Parameter Names

- When we declare a parameter to a method or a constructor, we provide a name to that parameter. This name is used within the method body to refer to the passed-in argument.

- The name of a parameter must be unique in its scope. It cannot be the same as the name of another parameter for the same method or constructor, and it cannot be the name of a local variable within the method or constructor.

- A parameter can have the same name as one of the class's fields. If this is the case, the parameter is said to shadow the field. Shadowing fields can make our code difficult to read and is conventionally used only within constructors and methods that set a particular field.


### Passing Primitive Data Type Arguments

- Primitive arguments, such as an int or a double, are passed into methods by value. This means that any changes to the values of the parameters exist only within the scope of the method. When the method returns the parameters are gone and any changes to them are lost.

### Passing Reference Data Type Arguments

- Reference data type parameters, such as objects , are also passed into methods by value. This means that when the method returns, the passed-in reference still references the same object as before. However the values of the object's fields can be changed in the method, if they have the proper access level.