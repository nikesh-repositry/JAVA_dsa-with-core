/*
string basics
built in methods
+ operator
comparison
int to string
immutability
string builder

 */
package STRINGS;
import java.util.Scanner;


public class basic {
    public static void main(String[] args) {
        //strings are immutable, new object created on modification
        //in java a string is not a primitive data type like int or char. it is a class representing a sequence of characters
        //non primitive behaviour = because it is an object , a string variable stores a reference to the memory location where the character data is held
        //java internally maintains strings as character array char[]
        // character array
        char[] arr1 = {'d','c','w','g','p'};

        //string
        Scanner sc = new Scanner(System.in);
        String word = sc.next();       // Reads until whitespace is hit
        String line = sc.nextLine();   // Reads full line
        System.out.println(word);
        System.out.println(line);

        //built in methods
        String str = "nikeshkk";
        System.out.println(str.length()); //8 prints length of string
        System.out.println(str.charAt(1)); //i
        System.out.println(str.indexOf('k')); //2
        System.out.println(str.lastIndexOf("k")); //7
        System.out.println(str.toUpperCase()); //NIKESHKK
        System.out.println(str.contains("shk")); //true
        System.out.println(str.startsWith("nik")); //ture
        System.out.println(str.endsWith("kk")); //true
        System.out.println(str.substring(1,5)); //ikes (one less than last index number

        //"+" operator
        //when you add a number to a string, the number is converted to a string and appended
        //left to right execution
        System.out.println("abc" + 10 + 20); // abc1020
        System.out.println(10 + 20 + "abc"); // 30abc
        System.out.println(10 +"abc"+20); //10abc20
        System.out.println('A'+"abc"); //Aabc
        System.out.println('A'+2+"abc"); //67abc

        //comparing string
        //==(reference comparison) checks if both variables point to the same memory location. it may return false even if the text is identical if one is in the SCP and the other is in the heap
        //.equals()(content comparison) checks if the actual characters are the same. this is the standard way to compare strings for equality
        //compareTo(String other) compares strings lexicographically(alphabatically) it returns the difference in ASCII values of the first mismatched character
        String a = "Java";
        String b = new String("Java");
        System.out.println(a == b);        // false (different references)
        System.out.println(a.equals(b));   // true (same content)
        System.out.println(a.compareTo("Jb")); // -1 (lexicographic)

        //interger to string conversion
        int n1 = 156;
        String s1 = ""+n1;   //concatenation with an empty string
        System.out.println(s1);
        String s2 = Integer.toString(n1); //works only on int/Integer
                                          //throws NullPointerException
        System.out.println(s2);
        String s3 = String.valueOf(n1); //works on any primitive or object
                                        //calls toString() if object, returns "null" if object is null
        System.out.println(s3);


    }
}
