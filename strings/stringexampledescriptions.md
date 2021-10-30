# Java String Concepts

## char and String

### char

* *char* is a Java primitive data type
* Primitive means that the variable holds the actual value, not a reference
* Others: boolean, byte, short, int, long. float and double
* char not Char
* The char data type can store:
  * Any letter
  * Numbers between 0 to 65,535 Inclusive
  * 16-bit Unicode characters including special characters
* A value for char is enclosed in single quotes ''
* There is also an object wrapper called *character* for a char data type

Examples:

```java
char ch = 'j';
char uniChar = '\0x004A'; // j in unicode
char[] charArray ={ '1', '2', '3', '4', '@' }; 
```

Methods:

* isLetter()
* isDigit()
* isWhitespace()
* isUpperCase()
* isLowerCase()
* toUpperCase()
* toLowerCase()
* toString()   //Returns a String object

### String

* *String* is a provided class in Java
* String not string
* String (and any other class) is a reference to an object
* A value for String is enclosed in double quotes ""
* String can also be stored in arrays, which are also objects
* String is made up of an array of chars
* Because strings are objects, they are immutable (cannot be changed once created)
* String Buffer & String Builder Classes provide mutable string functionality

Examples:

```java
String s = "j";
String[] strarray = {"One","Two", "Three", "Four","Five"};
```

## Commonly used string methods

### Java 8+ methods

* char charAt(int index)
* int compareTo(String anotherString)
* String concat(String str)
* int hashCode()
* int indexOf
* int length()
* String replace and String replaceAll
* String[] split(String regex)
* boolean startsWith(String prefix)
* String substring(int beginIndex)
* String toLowerCase()
* String toUpperCase()
* String trim()

### Java 11+ Methods

* isBlank()
* lines() returns a stream containing a collection of all * substrings split by lines (needs `java.util.stream.Collectors`)
* strip() – Removes all white space from strings, unicode-aware
* repeat(int) repeats a string (int) times

### Java 13+ Methods

* Text Blocks improve the readability of string literals when representing a multi-line string.

```java
// String literal formatting
String block = "'String literals can be hard to parse,' said Brian,\n" +
                 "'And read, --\n" +
                 "especially if the text spans multiple lines\n" +
                 "and needs embedded punctuation.'\n";

```


```java
// Text Block formatting
String block = """
Brian went on to say that 
'Text blocks are much more readable
And much easier to debug or follow'
""";

```

## String Arrays

* Every main method in Java has a string array declaration  as part of it's standard formatting:

```java
    public static void main(String[] args) {
    }
```

* String arrays can contain multiple string elements, also called tokens
* elements and tokens are referred to via their corresponding index number (int)
* Java array indexes start  at 0

## ArrayLists

* You need to know about java.util.ArrayList
* The size of an array cannot be modified
* If you want to add or remove elements to/from an array, you have to create a new one
* Elements can be added and removed from an ArrayList at any time
* To create an ArrayList object

```java
ArrayList<String> flexibleList = new ArrayList<String>()
```

## Naming Java variables

* All variable names must start with a letter, underscore (_), or dollar sign ($)
* The first character can not be a number  
* Numbers can be used after the first character
* Java has reserved words which cannot be used

