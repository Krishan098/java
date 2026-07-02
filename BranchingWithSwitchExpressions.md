### Modifying the Switch Syntax

- Motivation behind the new syntax:
    1. The default control flow behavior between switch labels is to fall through. This syntax is error-prone and leads to bugs in applications.
    2. The switch block is treated as one block. This may be an impediment in the case where you need to define a variable only in one particular case.
    3. The switch statement is a statement. Making it an expression could lead to better and more readable code.

```java
Day day = ...; // any day
int len =
    switch (day) {
        case MONDAY, FRIDAY, SUNDAY -> 6;
        case TUESDAY                -> 7;
        case THURSDAY, SATURDAY     -> 8;
        case WEDNESDAY              -> 9;
    };
IO.println("len = " + len);
```

- The syntax of switch label is now case L->. Only the code to the right of the label is executed if the label is matched. This code may be a single expression, a block, or a throw statement.

- This syntax also supports multiple constants per case, separated by commas.

### Producing a Value

- If there is only one statement in the case block, the value produced by this statement is returned by the switch expression.

- The syntax in the case of a block of code is a little different. Traditionally, the return keyword is used to denote the value produced by a block of code. Unfortunately this syntax leads to ambiguity in the case of the switch statement.

- The yield statement is a statement that can be used in any case block of a switch statement. It comes with a value, that becomes the value of the enclosing switch statement.

### Adding a Default Clause

- Default clauses allow our code to handle cases where the selector value does not match any case constant.

- The cases of a switch expression must be exhaustive. For all possible values, there must be a matching switch label. Switch statements are not required to be exhaustive. If the selector target does not match any switch label, this switch statement will not do anything, silently. This may be a place for bugs to hide in our application, something we want to avoid.

- There is still a case that needs to be dealt with. What would happen if someone adds an enumerated value in an enumeration, but forget to update the switch statements on this enumeration? To handle this case, the compiler adds a default clause for you in exhaustive switch statements. This default clause will never be executed in normal cases. It will be only if an enumerated value has been added, and will throw an IncompatibleClassChangeError.

- Handling exhaustiveness is a feature of switch expressions that is not provided by traditional switch statements and that is used in other cases than switch on enumerated values.

