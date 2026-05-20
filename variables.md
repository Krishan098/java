# Variables

- The Java programming language defines the following kinds of variables:

- **Instance Variable(Non-Static Fields)**: Objects store their individual states in "non-static fields", that is, fields declared without the static keyword. Non-static fields are also known as instance variables because their values are unique to each instance of a class(to each object, in other words); the currentSpeed of one bicycle is independent from the other.

- **Class Variables(Static Fields)**: A Class variable is any field declared with the static modifier; this tells the compiler that there is exactly one copy of this variable in existence, regardless of how many times the class has been instantiated. A field defining the number of gears for a particular kind of bicycle could be marked as static since conceptually the same number of gears will apply to all instances. The code ```static int numGears=6;``` would create such a static field. Additionally, the keyword **final** could be added to indicate that the number of gears will never change.

- **Local Variables**: Similar to how an object stores its state in fields, a method will often store its temporary state in local variables. The syntax for declaring a local variable is simialr to declaring a field(for example, int count=0;). There is no special keyword designating a variable as local; that determination comes entirely from the location in which the variable is declared -- which is between the opening and closing braces of a method. As such, local variables are only visible to the methods in which they are declared; they are not accessible from the rest of the class.

- **Parameters**: In ```public static void main(String[] args)``` , **args** variable is the parameter to this method. The important thing to remember is that parameters are always classified as "variables" and not "fields". This applies to other parameter-accepting constructs as well(such as constructors and exception handlers).

- A type's fields, methods, and nested types are collectively called it's **members**.

### Naming Variables

- Variables names are case-sensitive. A variable's name can be any legal identifier -- an unlimited length sequence of Unicode letters and digits, beginning with a letter the dollar sign $ or the underscore character. The convention however is to always use a letter in the beginning. By convention the dollar sign is never used nor the underscore.

- Subsequent characters may be letters, dollar signs, or underscore characters. When choosing a name for our variables, we should use full words instead of cryptic abbreviations. Doing this makes code easy to read and understand. Keep in mind that the variable name is not a keyword or a reserved word.

- If the name chosen consists of one word, spell that word in all lowercase letters. If it consists of more than one word, capitalize the first letter of each subsequent word. 