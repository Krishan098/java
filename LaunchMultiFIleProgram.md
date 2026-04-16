# Launching a Multi-File Program

- The java launcher can launch a multi-file source code program.

- It automatically locates, compiles and loads multi source-file programs so as long as the location of the source file matches the package structure of the classes being imported.

```java
import model.Person;
import service.PersonService;

public class Main{
        public static void main(String[] args){
                PersonService service = new PersonService();
                Person person = service.createNewPerson();
                IO.println(person.printName() + " has been created!");
        }
}
```

- The classes model.Person and service.PersonService would need to exist in the sub-directories model and service, respectively, of where the Main class is located.

## Reference JDK Classes and Non-JDK Classes

- A class that is part of the core JDK does not need to be added to the classpath to be executed.