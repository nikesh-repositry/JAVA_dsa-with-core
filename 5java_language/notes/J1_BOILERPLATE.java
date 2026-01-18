package LANGUAGE_CODE;
/*package consist the whole code class */

public class J1_BOILERPLATE {
    //public= is an access modifier. it means this class is open to the public and any other files so anybody can see and use this class. this can be private, protected and default-private
    //class= is a keyword used to define a blueprint and everything must be inside a class in java
    //J1_BOILERPLATE= is the name of class
    public static void main(String[] args) { //this is the actual entry point recognized by jvm
        //public= makes the method accessible, the jvm needs permission to enter this method
        //static= belongs to the class not an object, jvm needs to run this method before any objects are created and if you remove static jvm cant call it directly and program wont run
        //void= is the return type and it means the method does not return any value back to the system when it finishes but in custom main method it can be int or string return type
        //main= is the method name and jvm specially look for main as its the entry point of the program and if you rename it jvm wont find it and program wont run
        //(...)= these parenthesis hold the parameters for the method
        //String[]= meaning that parameters an array of string values passed from the command line, String[] args or String args[] → both valid. and it must alwaye be Stirng[] it cant be rename
        //args= is the variable name for that list. it stands for arguments. it can be renamed.   If you run your program from the command line like java Main apple banana, the args list would store "apple" and "banana". Even if you don't use it, Java requires this parameter to be there.
        System.out.println("hello world");
        //System= is a built in class provided by java. it contains useful tools to interact with your computer system like terminal
        //.= this dot operator is used to access something inside a class. it is like saying open system then look for...
        //out= is a static variable inside system that represents the output like in console or terminal
        //println= is a method that prints text to the screen and then moves the cursor to the next line
        //;= is the statement terminator and in java every single command must end with a semicolon. it is like the period at the end of a sentence
    }
}

