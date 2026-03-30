/*
string basics
built in methods
immutability
string builder

 */
package STRINGS;
import java.util.Scanner;


public class basic {
    public static void main(String[] args) {
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
        System.out.println(str.substring(1,5)); //ikes
    }
}
