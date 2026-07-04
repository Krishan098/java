# Defining Methods

- The only required elements of a method declaration are the method's return type, name, a pair of parantheses,(), and a body between braces,{}.

- They have 6 components in order:
    1. Modifiers- such as public, private etc.
    2. The return type- the data type of the value returned by the method, or void if the method doesnot return a value.
    3. The method name- the rules for field names apply to method names as well.
    4. The parameter list in paranthesis- a comma-delimited list of input parameters, preceded by their types, enclosed by parantheses,(). If there are no parameters, we must use empty parantheses.
    5. An exception list
    6. The method body, enclosed between braces, the method's code, including the declaration of local variables, goes here.

- Two of the components of a method declaration comprise the method declaration comprise the method signature- the method's name and the parameter types.

### Naming a Method

- Although a method name can be any legal identifier, code conventions restrict method names. By convention, method names should be a verb in lowercase or a multi-word name that begins with a verb in lowercase, followed by adjectives, nouns, etc. In multi-word names, the first letter of each of the second and following words should be capitalized.

- Typically a method has a unique name within its class. However, a method might have the same name as other methods due to *method overloading*.

### Overloading Methods

- Methods within a class can have the same name if they have different parameters lists.

- Suppose that you have a class that can use calligraphy to draw various types of data (strings, integers, and so on) and that contains a method for drawing each data type. It is cumbersome to use a new name for each method—for example, drawString(), drawInteger(), drawFloat(), and so on. In the Java programming language, you can use the same name for all the drawing methods but pass a different argument list to each method. Thus, the data drawing class might declare four methods named draw(), each of which has a different parameter list.

```java
public class DataArtist {
    ...
    public void draw(String s) {
        ...
    }
    public void draw(int i) {
        ...
    }
    public void draw(double f) {
        ...
    }
    public void draw(int i, double f) {
        ...
    }
}
```

- Overloaded methods are differentiated by the number and the type of the arguments passed into the method. In the code sample, draw(String s) and draw(int i) are distinct and unique methods because they require different argument types.

- You cannot declare more than one method with the same name and the same number and type of arguments, because the compiler cannot tell them apart.

- The compiler doesnot consider the return type when differentiating methods, so we cannot declare 2 methods with the same signature even if they have a different return type.

- Overloaded methods should be used sparingly, as they can make code much less readable.