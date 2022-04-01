# Conditional Logic Concepts

Conditional logic helps to control the flow of a code in Java. It consists of the following components:

* Test expression(s)
* Body/code block to be executed

## Operators

### Logical operators

* && AND operator
* ! NOT operator
* || OR operator
* Order of evaluation - Paranthesis, NOT, AND, OR

Examples:

```java
boolean x = true || false;
boolean y = false && true;

System.out.println(!x);
>> true
```

### Conditional operators

* \> greater than
* \>= greater than or equal to
* < less than
* <= less than or equal to
* == equal to
* != not equal to

## if statement

* Evaluates test expression given in paranthesis
* If test expression evaluates to `true`, then the statements in the code block are executed

Syntax:

```code
if(condition) {
  statements..
}
```

Example:

```java
// Print if number is odd or even
if(number % 2 == 0) {
  System.out.println("number is even");
}
```

## if-else statement

* Evaluates test expression given in paranthesis
* If test expression evaluates to `true`, then the statements in the code block are executed
* If test expression evaluates to `false`, then the statements under the `else` block are executed

Syntax:

```code
if(condition) {
  statements..
}
else {
  statements..
}
```

Example:

```java
// Print if number is odd or even
if(number % 2 == 0) {
  System.out.println("number is even");
}
else {
  System.out.println("number is odd");
}
```

## Handling Multiple Conditions

* Chaining and nesting can make the code difficult to read

### if... else if... else

Syntax:

```code
if(condition1) {
  statements..
}
else if(condition2){
  statements..
}
else {
  statements..
}
```

Example:

```java
// Print if number is odd or even
if(number == 0) {
  System.out.println("number is 0");
}
else if(number % 2 == 0) {
  System.out.println("number is even");
}
else {
  System.out.println("number is odd");
}
```

### switch (Java 7+)

* Multiple possible execution paths
* Chooses one possibility out of multiple options
* `break` statement is used to terminate statement flow
* `default` statement is optional

Syntax:

```code
switch(expression) {
  case value1 :
    statements..
    break;

  case value2 :
    statements..

  default :
    statements..
}
```

Example:

```java
String dayOfTheWeek = getDayOfTheWeek();
boolean weekend;
switch (dayOfTheWeek) {
  case "monday":
  case "tuesday":
  case "wednesday":
  case "thursday":
  case "friday":
    weekend = false;
    break;
  case "saturday":
  case "sunday":
    weekend = true;
    break;
  default:
    System.out.println("Unknown day of the week!");
}
```

### switch (Java 14+)

```code
switch(expression) {
  case value1 -> boolean;
  case value2 -> boolean;
  case value3 -> boolean;
  default :-> {
    statements..
  }
}
```

Example:

```java
String dayOfTheWeek = getDayOfTheWeek();
boolean weekend = switch (dayOfTheWeek) {
  case "monday" -> false;
  case "tuesday" -> false;
  case "wednesday"-> false;
  case "thursday" -> false;
  case "friday" -> false;
  case "saturday" -> true;
  case "sunday" -> true;
  default -> {
    System.out.println("Unknown day of the week!");
  }
}
```
