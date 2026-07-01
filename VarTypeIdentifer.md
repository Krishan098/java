# Using the Var Type Identifier

### The var Keyword

- We can use the var type identifier to declare a local variable. In doing so, we let the compiler decide what is the real type of the variable we create. Once created, this type cannot be changed.

```java
String message="Hello mate";
Path path=Path.of("debug.log");
InputStream stream=Files.newInputStream(path);
```

- In this case, having to declare the explicit types of the 3 variables message, path and stream is redundant.

- With the var type identifier we can write the above code as follows:

```java
var message="Hello";
var path=Path.of("debug.log");
var stream=Files.newInputStream(path);
```

```java
var list=List.of("one","two","three");
for (var element:list){
    IO.println(element);
}
```
### Restrictions on Using Var

1. We can only use it for local variables declared in methods, constructors and initializer blocks.

2. var cannot be used for fields, nor for methods or constructor parameters.

3. The compiler must be able to choose a type when the variable is declared. Since null has no type, the variable must have an initializer.

- Following the restrictions, the following class doesnot compile, because using var as a type identifier is not possible for a field or a method parameter.

```java
public class User{
    private var name="Sue";//COMPILER ERROR
    public void setName(var name){
        this.name=name;
    }
}
```