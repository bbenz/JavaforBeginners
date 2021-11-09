import java.util.regex.Pattern;
import java.util.StringTokenizer;
import java.util.StringJoiner;
import java.util.stream.*;
import java.util.Arrays;
import java.util.ArrayList; 

public class stringformattingexample1 {

//char to String

    public static String charToString(char c) {
        return Character.toString(c);
    }

//String to char

    public static char StringToChar(String str) {
        return str.charAt(0);
    }

// String to char array 

    public static char[] StringToCharUsingtoCharArray(String str) { 
            //String str = "onetwothreefourfive";
            char chararray[] = str.toCharArray();
            for(char ch:chararray){
                System.out.println(ch);
            }
            return chararray;
            
}


public static char[] StringToCharUsinggetChars(String str)  {
        //String str = "onetwothreefourfive";
        char[] chararr = new char[8];
        str.getChars(8, 16, chararr, 0);
        for(char ch: chararr){
           System.out.print(ch+" ");
        }
        return chararr;
    }

    public static Character[] StringToCharUsingChars(String str)  {
        //String str = "onetwothreefourfive";
        Character[] arraychars = str.chars()
                                      .mapToObj(c -> (char) c)
                                      .toArray(Character[]::new);
        for(Character ch: arraychars){
            if(Character.isLowerCase(ch))
                System.out.print(ch+" ");
        }
        return arraychars;  
    }

    //String Array to String
    

    public String ArraytoStringusingtoString (String[] strarray) {      
            //String[] strarray = {"One","Two", "Three", "Four","Five"};
            String str = Arrays.toString(strarray);
            return str;
    }
 
    public String ArraytoStringusingStringBuilderandAppend (String[] strarray) {      
            //String[] strarray = {"One","Two", "Three", "Four","Five"};
            StringBuilder stringb = new StringBuilder();
            for (int i = 0; i < strarray.length; i++) {
                stringb.append(strarray[i]+" ");
            }    
            return stringb.toString();
        
    }

    //must import java.util.StringJoiner;
    public String ArraytoStringusingStringJoiner (String[] strarray) {      
            //String[] strarray = {"One","Two", "Three", "Four","Five"};
            StringJoiner stringj = new StringJoiner(";;;", "[", "]");
            for (int i = 0; i < strarray.length; i++) {
               stringj.add(strarray[i]+"/");
            }
            return stringj.toString();
        }
     
    //must import java.util.stream.* and java.util.Arrays;
        public String ArraytoStringusingStreamandcollector (String[] strarray) {      
            //String[] strarray = {"One","Two", "Three", "Four","Five"};
            return Stream.of(strarray).collect(Collectors.joining());
            }
        

    //String to String Array 
    public String[] StringToArrayusingSplit (String str) {
        //String[] strarray = {"One","Two", "Three", "Four","Five"};
            String[] strarray = str.split(",");
            if(strarray.length > 0){
                for(String elm: strarray){
                    System.out.print(elm+" ");
                }
            }
            return strarray;
        }
 
        // must import java.util.regex.Pattern;    
        public String[] StringToArrayusingPattern (String str) {
            //String str = "one  two  three  four  five";
            String splitpattern = "\\s\\s"; //2 spaces
                Pattern pattern = Pattern.compile(splitpattern); 
                String[] strarray = pattern.split(str); 
                for (int i = 0; i < strarray.length; i++) { 
                    System.out.println("strarray[" + i + "]=" + strarray[i]); 
                } 
                return strarray;
            }    
            
        //must import java.util.StringTokenizer;
        public String[] StringToArrayusingTokenizer (String str) {
        
                //String str = "one, two, three, four, five";
                StringTokenizer tokenizer = new StringTokenizer( str,",");
                String [] strarray = new String[tokenizer.countTokens()];
                // Add tokens to our array 
                int i = 0;
                while(tokenizer.hasMoreTokens()) {
                    strarray[i] = tokenizer.nextToken();
                    i++;
                }
                for(String stritem : strarray){
                    System.out.println(stritem);
                }
                return strarray;
            }
    
    }