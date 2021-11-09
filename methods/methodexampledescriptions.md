# Java for Beginners - Methods

## Example 1 - A simple method and where it goes

### Java classes and methods 

* A source file has a .java extension.
* Every .java file or Java application has at least one class, and at least one main method
* A JVM looks for a class provided at startup, either via the command line or a manifest
* Then it looks for the main method in a class
* A JVM runs everything between the curly braces {} of your main method.
* A class creates an object that runs methods 
* One or more methods can be located inside a class
* Method code is a set of statements, which are instructions on how that method should be performed
* Methods return one value. That value can be an array to handle multiple return values.  
* A method that returns no value must be declared void

## Example 2 - Calling methods

### Method declarations 

Method components:

* The method name
* Access modifiers: public, private, protected, default
* Non-access Modifiers — static, final
* Keywords: abstract (for templates), synchronized (for single-thread methods), native (non-java code),strictfp (floating point calculations only)
* The parameter list - comma-delimited, enclosed by parentheses (). No parameters = empty parentheses ().
* An optional exception list
* The method body, enclosed between curly braces {}
* Return values if the method is not void

### Parameters and variables

* A value passed to a method is called an argument.
* A value received from an argument is called a parameter
* More than one argument or parameter is separated by commas
* Passing a method as an argument is permitted, with the correct parameter type(s) and order.

### Instance variables and local variables

* Instance variables are declared inside a class but outside a method
* Local variables are declared within a method
* Local variables must be initialized, instance variables have default values so they don’t need initialization to run.
* A method uses parameters to receive a passed variable, which behaves like a local variable

## Example 3 - calling methods with arguments and parameters

### passing and managing variables

* Java is always pass by value
* Because of this, values cannot be passed directly 
* Getters and setters (encapsulation) use public and private access modifiers
* private getters and setters are used for access control.
* Local variables are created inside methods
* Instance variables are created in classes but outside of methods.

### Stacks, heaps, objects and variables: 

* Java handles memory in two ways, via the stack and the heap
* A JVM stack stores local variables and manages invocation and management of methods
* The stack is never manipulated directly
* A JVM heap is shared among all applications and threads running on a single JVM
* All objects, classes, and related instance variables are stored in the heap
* Java uses space in the heap for stack management, but does not allow direct control over stack allocation
* Objects in the stack are never explicitly deallocated.
* Garbage collection is used to deallocate idle objects in the stack 
* Local variables are created in stacks (and also but rarely referred to as stack variables)
* Local variables like primitives and object references are created on Stack memory.
* Objects are created on Heap memory.
* Instance variables are part of heap memory, because they are part of the object (inside a class but not inside a method)

### Modifiers

* Marking a method as public and static makes it behave like a global variable.
* Any code in any class of an application can access a public static method.
* Any variable marked as public, static, and final = a globally-available constant.

