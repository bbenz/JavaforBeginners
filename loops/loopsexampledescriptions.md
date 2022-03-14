# Java Loop Concepts

Loops in Java are used to repeat certain code or set of instructions for a certain number of times.
A loop generally has the following four components:

* Initialization expression(s)
* Test expression(s)
* Update expression(s)
* Body/code block to be executed

## while loop

* Entry-controlled loop
* Evaluates test expression given in paranthesis
* If test expression evaluates to `true`, then the statements in the body of the loop are executed
* Test expression is evaluated again
* Loop is executed until test expression is evaluated to `false`
* If test expression is false the control flow does not enter the body of loop
* Do not forget to satisfy the exit criteria in the body of the loop for it to exit

Syntax:

```code
while(condition) {
  statements..
}
```

Example:

```java
// Print numbers below 5
int number = 0;
while(number < 5) {
  System.out.println(number);
  number++;
}
```

### Empty while loop

* Does not contain any statements in the body of code
* Typically used as time delay loops

```java
// Time delay loop
long timeDelay = 0;
while(++timeDelay < 10000)
;
```

### Infinite while loop

* Update expression is not provided
* Test expression always evaluates to `true`
* Program has to be abruptly halted

```java
// Infinite while loop
int number = 5;
while(number == 5) {
  System.out.println("This is unending!");
}

```

## do-while loop

* Exit-controlled loop
* Starts with executing statements in code block
* Test expression is evaluated
* Code block is executed till test expression evaluates to `false`
* The statements in the code block are executed at least once

Syntax:

```code
do
{
  statements..
}
while(condition);
```

Example:

```java
// Print numbers below 5
int number = 0;
do {
  System.out.println(number);
  number++;
}
while(number < 5);
```

## for loop (classic style)

* Entry-controlled loop
* Initialization expression, test expression, update expression
* Initialization expression executed only once
* Statements in code block are executed till test expression is satisfied

Syntax:

```code
for(initialization ; test expression ; update expression) {
  statements..
}
```

Example:

```java
// Print numbers below 5
for(int number = 0; number < 5; number++) {
  System.out.println(number);
}
```

### Nested for loop

* Loop inside another loop
* Inner loop executes completely each time

Example:

```java
for(int i = 1; i < 5; i++) {
  for(int j = 1; j < 5; j++) {
    System.out.println(i + " " + j);
  }
}
```

### Infinite for loop

Example:

* Test expression never evaluates to `false`

```java
for(int i = 1; i < 5; i--) {
  System.out.println("This is unending!");
}

```

## for loop (iterable)

* for-each loop
* Iterate through elements of a collection or an array
* Read-only loop

Syntax:

```code
for (T element:Collection of object/array) {
  statements...
}
```

Example:

```java
List<String> names = new LinkedList<>();
names.add("John");
names.add("Jane");

for (String name : names) {
  System.out.println(name);
}
```
