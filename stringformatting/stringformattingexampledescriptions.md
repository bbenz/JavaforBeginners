# Formatting Strings

## Formatting and Conversion Notes

* There are many, many, many ways to format strings in Java
* You cannot pass values between the primitive data type char and String objects
  * They must be converted
* There is no single best solution, it depends on your environment and needs
* Here are several common scenarios and examples to help you compare and contrast options

## char to String 

### String.valueOf(char)

* To format char as a String, use the String.valueOf(char) method
  * returns char as a string object

```java
  public static String charToString(char c) {
        return Character.toString(c);
    }
```

## String to char

### charAt(int)

* To format a character in a String as a char,  use the charAt(int) method
  * returns the character at position (int).

```java
public static char StringToChar(String str) {
    return str.charAt(0);
}
```

## String to char array

### toCharArray() Method 

* creates an accessible char[] array
* Java stores strings as primitive char[] arrays internallybut they are not accessible
* Useful when working with non delimited string.  Example: String str = "onetwothreefourfive";

```java
char chararray[] = str.toCharArray();
```

### getChars()

* Copy characters from a string or a part of a string into a char[] array
* Arguments are provided for string start, string end, array start, and Destination

```java
mystr.getChars(0, 16, chararr, 0);

```

### Streaming - chars() method 

* Creates a Stream from a String object
* Use the mapToObj() and toArray() with chars() to convert a string to array of characters
* helpful when selecting characters in a string based on conditions of each character

```java
Character[] arraychars = str.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);
```

## String Array to String

### Arrays.toString();

* Simple way to convert an array to a string

```java
String str = Arrays.toString(strarray);
```
### StringBuilder() and append()

* Provides the option to conditionally add array elements to a string

```java
StringBuilder stringb = new StringBuilder();
            for (int i = 0; i < strarray.length; i++) {
                stringb.append(strarray[i]+" ");
            }    
```
### String Joiner

Parameters:

* Options for adding strings at the beginning and end of the constructed string
* Also defines characters to be used between array elements
* java.util.StringJoiner must be imported into your class

```java
StringJoiner stringj = new StringJoiner(";;;", "[", "]");
```

### Stream and collector

* Useful if you are provided with a string to consume
* Also can be used to produce an ArrayList
* java.util.stream.* and java.util.Arrays must be imported into your class

```java
return Stream.of(strarray).collect(Collectors.joining());
```

## String to String Array

### split() Method

* Splits a delimited string into string[] array using a specified character as a delimiter

```java
String[] strarray = str.split(",");
```

### pattern.split()

* Splits a delimited string into string[] array using a specified pattern as a delimiter
* java.util.regex.Pattern must be imported into your class

```java
String splitpattern = "\\s\\s"; //2 spaces
Pattern pattern = Pattern.compile(splitpattern); 
```

### StringTokenizer Class

* Splits a string object into tokens
* Used to split a non-delimited string into an array
* Delimiters can be specified, default = space
* java.util.StringTokenizer must be imported into your class

```java


    import java.util.StringTokenizer;    
    ..........
    StringTokenizer tokenizer = new StringTokenizer(str);
    String [] strarray = new String[tokenizer.countTokens()];
    // Add tokens to an array 
        int i = 0;
        while(tokenizer.hasMoreTokens()) {
            strarray[i] = tokenizer.nextToken();
            i++;
        }

```
