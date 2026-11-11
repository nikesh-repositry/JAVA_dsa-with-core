package STRINGS;
import java.sql.SQLOutput;
import java.util.*;
public class BASIC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //CREATION OF STRING
        String s1 = "java"; //string literal
        String s2 = new String("java"); //creates a string object explicitly

        //A. LENGTH AND CHARACTER ACCESS  length() charAt() toCharArray()
        String s3 = "nikesh";
        System.out.println(s3.length()); //6
        System.out.println(s3.charAt(2)); //k
        System.out.println(s3.charAt(s3.length()-1)); //h
        //valid indexes for a string of length n are from 0 to n-1
        System.out.println(s3.toCharArray()); //converts string into char array
        //but if you try to concate the char array with a string inside the print statement
        //then java normal array to string conversion rule takes back over for eg
        System.out.println("result"+ s3.toCharArray()); //result[C@65b3120a  so use String.valueOf() instead to convert it back
        System.out.println("result" + String.valueOf(s3.toCharArray())); //resultnikesh


        //STRING COMPARISON  equals() equalsIgnoreCase() compareTo() compareToIgnoreCase()
        String s4 = "java";
        String s5 = "java";
        String s6 = "Java";
        String s7 = new String("java");
        String s8 = new String("java");
        System.out.println(s4.equals(s5)); //true
        System.out.println(s4.equalsIgnoreCase(s6)); //true
        //== vs equals()
        System.out.println(s4 == s5); //true
        System.out.println(s4.equals(s5)); //true
        System.out.println(s7 == s8); //false  checks whether both references point to the same object
        System.out.println(s7.equals(s8)); //true   checks whether their contents are equal
        System.out.println(s5.compareTo(s6)); //32  COMPARETO COMPARES STRING LEXICOGRAPHICALLY
        System.out.println(s7.compareTo(s8)); //0
        System.out.println("Apple".compareTo("Banana")); //-1
        //-ve value means first string comes before second
        //+ve value means first string comes after second
        //0 means both string are equal lexicographically



        //SEARCHING INSIDE A STRING  contains() indexOf() lastIndexOf() startsWith() endsWith()
        String s9 = "Accenture";
        System.out.println(s9.contains("tur")); //true CHECKS WHETHER SUBSTRING EXISTS
        System.out.println(s9.indexOf("c")); //1 FINDS FIRST OCCURRENCE AND IF NOT FOUND THEN RETURNS -1
        System.out.println(s9.lastIndexOf("c")); //2 FINDS LAST OCCURRENCE
        System.out.println(s9.startsWith("Acc")); //true CHECKS STARTING CHARACTERS
        System.out.println(s9.endsWith("ure")); //true CHECKS ENDING CHARACTERS



        //EXTRACTING A SUBSTRING substring()
        System.out.println(s9.substring(2)); //centure
        System.out.println(s9.substring(0,5)); //Accen
        System.out.println(s9.substring(5,s9.length())); //ture
        //here the end index is exclusive



        //CHANGING CASES toUpperCase() toLowerCase()
        System.out.println(s9.toLowerCase()); //accenture
        System.out.println(s9.toUpperCase()); //ACCENTURE
        //these methods return new string they do not modify the original string



        //REMOVING SPACES   trim() strip() stripLeading() stripTrailing()
        String s10 = "     ja va   ";
        System.out.println(s10.trim()); //ja va
        System.out.println(s10.strip()); //ja va
        System.out.println(s10.stripLeading()); //ja va
        System.out.println(s10.stripTrailing()); //     ja va
        //also trim and strip do not remove spaces from the middle of a string



        //REPLACING CHARACTERS AND TEXT  replace() replaceAll() replaceFirst()
        String s11 = "banana";
        System.out.println(s11.replace("a","e")); //benene
        System.out.println(s11.replaceAll("a","e")); //benene
        // Both methods produce benene because a plain letter "a" behaves identically whether searched as a literal string in replace() or as a basic regular expression pattern in replaceAll().
        String s = "Java123Programming456";
        System.out.println(s.replaceAll("[0-9]", "")); //JavaProgramming   REMOVE ALL DIGITS
        System.out.println(s.replaceAll("\\d","")); //JavaProgramming
        System.out.println(s.replaceAll("\\D","")); //123456   REMOVE ALL CHARACTERS
        System.out.println(s.replaceAll("[^0-9]","")); //123456
        String s13 = "  java  is a    powerful  language     ";
        System.out.println(s13.replaceAll("\\s","")); //javaisapowerfullanguage   REMOVE ALL THE WHITESPACES
        String s14 = "hello123 $$%%% there082@##$";
        System.out.println(s14.replaceAll("[^a-zA-z]","")); //hellothere    REMOVING EVERYTHING EXCEPT LETTERS
        //replaceAll() uses regex. For simple character replacement, prefer replace().



        //SPLITTING A STRING  split()
        String s15 = "java,python,c";
        String[] arr = s15.split(",");
        for( String ss : arr){
            System.out.println(ss);
        }
        //java
        //python
        //c
        String s16 = "java is easy";  //split by space
        String[] arr2 = s16.split("\\s+");
        System.out.println(Arrays.toString(arr2)); //[java, is, easy]
        String s17 = "www.google.com";
        String[] arr3 = s17.split("\\.");
        System.out.println(Arrays.toString(arr3)); //[www, google, com]




        //CHECKING EMPTY STRINGS
        String s18 = "";
        String s19 = " ";
        System.out.println(s18.isBlank()); //true
        System.out.println(s18.isEmpty()); //true
        System.out.println(s19.isBlank()); //true
        System.out.println(s19.isEmpty()); //false
        //isEmpty() checks whether length is 0
        //isBlank() checks whether string is empty or contains only whitespace



        //CONVERTIGN STRING TO NUMBER
        String s20 = "125";
        System.out.println(s20+10); //12510
        int num = Integer.parseInt(s20);
        System.out.println(num+10); //135
        /*
        string to int     Integer.parseInt()
        string to long    Long.parseLong()
        string to double  Double.parseDouble()
        string to float   Float.parseFloat()
        Number to string  String.valueOf()
         */
        String s21 = "25";
        int num2 = Integer.parseInt(s21);
        System.out.println(num2+100); //125
        String s22 = String.valueOf(num2);
        System.out.println(s22+100); //25100



        //STRINGBUILDER IN JAVA
        //STRINGBUILDER IS A CLASS USED TO CREATE AND MODIFY A SEQUENCE OF CHARACTERS
        //WITHOUT CREATING A NEW STRING OBJECT FOR EVERY MODIFICATION
        StringBuilder sb = new StringBuilder("java");
        //STRINGBUILDER IS MUTABLE
        //ESSENTIAL METHODS
        //A. append()
        sb.append(" programming");
        System.out.println(sb); //java programming
        sb.append("hug:: "); //can also append different data types
        sb.append(546);
        sb.append("&#*(");
        sb.append(556.6);
        System.out.println(sb); //java programminghug:: 546&#*(556.6


        //INSERT() INSERT CONTENT AT A SPECIFIED INDEX
        StringBuilder sb2 = new StringBuilder("jva");
        sb2.insert(1,"a");
        System.out.println(sb2); //java


        //delete()  DELETES CHARACTERS FROM A RANGE
        StringBuilder sb3 = new StringBuilder("programming");
        sb3.delete(0,2);
        System.out.println(sb3); //ogramming



        //deleteCharAt()  DELETES ONE CHARACTER
        StringBuilder sb4 = new StringBuilder("noble");
        sb4.deleteCharAt(3);
        System.out.println(sb4);  //nobe


        //setCharAt()  CHANGES A CHARACTER AT A SPECIFIC INDEX
        StringBuilder sb5 = new StringBuilder("lome");
        sb5.setCharAt(1,'i'); //here use '' not ""
        System.out.println(sb5); //lime


        //reverse()
        StringBuilder sb6 = new StringBuilder("jimmy");
        System.out.println(sb6.reverse()); //ymmij
        //REVERSE A STRING
        String s28 = "hindi";
        String s29 = new StringBuilder(s28).reverse().toString();
        System.out.println(s29); //idnih


        //replace()  REPLACE CHARACTERS IN A SPECIFIED RANGE
        StringBuilder sb7 = new StringBuilder("java");
        sb7.replace(0,1,"l"); //lava
        System.out.println(sb7);


        //length()  RETURNS THE NUMBER OF CHARACTERS
        StringBuilder sb8 = new StringBuilder("java");
        System.out.println(sb8.length()); //4


        //capacity()  RETURNS THE CURRENT STORAGE CAPACITY
        StringBuilder sb9 = new StringBuilder();
        StringBuilder sb10 = new StringBuilder("javas");
        System.out.println(sb9.capacity()); //16
        //the default capacity is 16 for an empty stringbuilder
        System.out.println(sb10.capacity()); //21
        //for a stringbuilder initialized with a string then default capacity is its string length plus 16



        //toString()  CONVERTS STRINGBUILDER INTO STRING
        String s30 = sb10.toString();
        System.out.println(s30);  //javas


        //charAt()   GETS A CHARACTER AT AN INDEX
        System.out.println(sb10.charAt(2)); //v


        //indexOf()  FINDS THE FIRST OCCURRENCE OF A SUBSTRING
        StringBuilder sb11 = new StringBuilder("java programming");
        System.out.println(sb11.indexOf("pro")); //4


        //setLength()  SET THE LENGTH OF THE STRINGBUILDER
        sb11.setLength(4);
        System.out.println(sb11); //java


        //equals()
        StringBuilder sb15 = new StringBuilder("JAVA");
        StringBuilder sb16 = new StringBuilder("JAVA");
        System.out.println(sb15.equals(sb16)); //false
        //for content comparison
        System.out.println(sb15.toString().equals(sb16.toString())); //true













    }
}
