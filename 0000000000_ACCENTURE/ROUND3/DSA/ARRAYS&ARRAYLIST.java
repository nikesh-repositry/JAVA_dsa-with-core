package ARRAYS;
import java.sql.SQLOutput;
import java.util.*;
public class BASIC {
    public static void main(String []args){

        //TAKING INPUT IN AN ARRAY
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter length of array");
//        int l = sc.nextInt();
//        int[] ll = new int[l];
//        System.out.println("enter elements");
//        for(int i=0; i<l;i++){
//            ll[i] = sc.nextInt();
//        }
//        for(int i : ll){
//            System.out.print(i);
//        }

        //Arrays.sort(arr) Arrays.toString(arr) SORT THE ARRAYS
        int[] arr = {2,5,9,2,6,84,56};
        Arrays.sort(arr);
        System.out.println(arr); // [I@6f496d9f this is not how to print
        System.out.println(Arrays.toString(arr));// [2, 2, 5, 6, 9, 56, 84]
        //sorting array specific range
        Arrays.sort(arr,0,5);
        System.out.println(Arrays.toString(arr));
        //one thing to remember is that Arrays.sort() rearrange
        //the array in place

        //Arrays.toString(arr)  CONVERTS THE ARRAY INTO READABLE FORM
        int[] arr1 = {2,56,3,6,8};
        System.out.println(Arrays.toString(arr1));
        int[][] arr2 = {  //for 2d array  deepToString(arr)
                {1,2},
                {3,4}
        };
        System.out.println(Arrays.deepToString(arr2)); //[[1, 2], [3, 4]]


        //Arrays.equals(arr1, arr2)  TO CHECK TWO ARRAYS CONTENT
        int[] arr3 = {1,2,3};
        int[] arr4 = {1,2,3};
        System.out.println(Arrays.equals(arr3,arr4)); //true
        //arr3 == arr4 this only check reference not content
        // for 2d array Arrays.deepEquals(arr1, arr2)


        //Arrays.fill(arr, i,j,val)  FILL EVERY ARRAY ELEMENT WITH SAME VALUE
        int[] arr5 = new int[5];
        Arrays.fill(arr5, 13);
        System.out.println(Arrays.toString(arr5)); //[13, 13, 13, 13, 13]
        //FILL A SPECIFIC RANGE
        int[] arr6 = {1,2,3,4,5,6,7};
        Arrays.fill(arr6,1,4,0); //[1, 0, 0, 0, 5, 6, 7]
        System.out.println(Arrays.toString(arr6));


        //Arrays.copyOf(arr, newlength)  COPY AN ARRAY AND OPTIONALLY CHANGE ITS LENGTH
        int[] arr7 = {2,3,4,5,6};
        int[] arr8 = Arrays.copyOf(arr7,2);
        System.out.println(Arrays.toString(arr8)); //[2, 3]
        int[] arr9 = Arrays.copyOf(arr7,10);
        System.out.println(Arrays.toString(arr9)); //[2, 3, 4, 5, 6, 0, 0, 0, 0, 0] no error 0 comes by default if no value


        //Arrays.copyOfRange(arr, start, end) COPY VALUE IN RANGE
        int[] arr10 = {1,2,3,4,5,6,7};
        int[] arr11 = Arrays.copyOfRange(arr10,1,5);
        System.out.println(Arrays.toString(arr11)); //[2, 3, 4, 5]


        //Arrays.binarySearch(arr, ele)  SEARCH FOR AN ELEMENT IN A SORTED ARRAY
        int[] arr12 = {1,2,3,4,5,6,55,88,65};
        int result = Arrays.binarySearch(arr12,88);
        System.out.println(result); //7
        int res1 = Arrays.binarySearch(arr12, 7);
        System.out.println(res1); // -7
        //WHY -7 DUE TO THIS FORMULA -(insertion point) - 1 ,INSERTION POINT MEANS THE EXACT
        //INDEX WHERE THE MISSING DIGIT SHOULD BE PARKED SO THE LIST STAYS SORTED


        //Arrays.compare(arr1, arr2) compare arrays lexographically
        int[] arr13 = {1,2,3};
        int[] arr14 = {1,2,5};
        System.out.println(Arrays.compare( arr14,arr13)); //1
        System.out.println(Arrays.compare(arr13,arr14)); //-1
        /*
Result	    Meaning
Negative	First array is smaller
Zero	    Both arrays are equal
Positive	First array is greater */


        //Arrays.mismatch()  FIND THE INDEX OF THE FIRST DIFFERING ELEMENT BETWEEN TWO ARRAYS
        int[] arr15 = {1,2,3,4,6,7,8};
        int[] arr16 = {1,2,3,4,5,6,7};
        System.out.println(Arrays.mismatch(arr15,arr16)); //4

        //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         //
         // ARRAYLIST
        /*
        How to create an ArrayList.
How to insert elements.
How to access elements.
How to update elements.
How to delete elements.
How to parse input into an ArrayList.
How to print an ArrayList.
How to return an ArrayList from a method.
How to convert an ArrayList into an array and vice versa.
All important built-in functions
How to use ArrayList in coding questions.
Common bugs that appear in coding assessments.
         */

        //HOW TO CREATE ARRAYLIST
        ArrayList<Integer> list1 = new ArrayList<>(); //EMPTY ARRAYLIST
        //ADD ELEMENTS
        list1.add(1);
        list1.add(2);
        //ARRAYLIST WITH INITIAL CAPACITY
        ArrayList<Integer> list2 = new ArrayList<>(5);
        System.out.println(list2.size()); //0
        //CREATE ARRAYLIST WITH EXISTING VALUES
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4));
        //CREATE A STRING ARRAYLIST
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("aba");
        list4.add("add");
        list4.add("ajd");
        System.out.println(list4); //[aba, add, ajd]



        //HOW TO INSERT ELEMENTS
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(10); //element inserted at the end of the list
        list5.add(11);
        System.out.println(list5); //[10, 11]
        list5.add(2,12);
        System.out.println(list5); //[10, 11, 12]
        list5.add(1,9);  //add element at specific index
        System.out.println(list5); //[10, 9, 11, 12]
        list5.add(0,22); //insert at beginning
        System.out.println(list5); //[22, 10, 9, 11, 12]
        list5.add(list5.size(),100); //insert at end
        System.out.println(list5); //[22, 10, 9, 11, 12, 100]


        //HOW TO ACCESS ELEMENT
        System.out.println(list5.get(3)); //11
        System.out.println(list5.get(0)); //22
        System.out.println(list5.get(list5.size()-1)); //100


        //HOW TO MODIFY ELEMENTS
        list5.set(0,99);
        System.out.println(list5);
        //[22, 10, 9, 11, 12, 100] before
        //[99, 10, 9, 11, 12, 100] after 22 is replaced by 99


        //HOW TO REMOVE ELEMENTS
        //ARRAYLIST PROVIDES TWO OVERLOADED remove() METHODS
        //A. remove(index) remove by position
        list5.remove(2);
        System.out.println(list5);// [99, 10, 11, 12, 100]
        //B. remove(value)
        list5.remove(Integer.valueOf(11));
        System.out.println(list5);// [99, 10, 12, 100]
        //for every other non-number data type (like Strings or custom objects)! Java figures it out automatically.
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
// You just pass the text directly! for non number datatype
        names.remove("Bob");
        System.out.println(names); //[Alice, Charlie]
// Output: [Alice, Charlie]
        names.remove(1);
        System.out.println(names); //[Alice, Charlie]
        //C. DELETE EVERYTHING
        names.clear();
        //D. DELETE ELEMENT BASED ON A CONDITION
        ArrayList<Integer> list8 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8,55,44,66));
        list8.removeIf(x->x%2==0);
        System.out.println(list8); //[1, 3, 5, 55]
        //E. REMOVE ELEMENTS WHILE TRAVERSING
        // A VERY COMMON BUG
        ArrayList<Integer> list9 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8,55,44,66));
//        for(int i=0;i<list9.size();i++){
//            if(list9.get(i)%2!=0){
//                list9.remove(i);
//            }
//        }
//        System.out.println(list9); //[2, 4, 6, 8, 44, 66]
        //yeah both loop output the same result but this one is not the best practice
        //if you are removing elements while parsing
        //as this may skip elements because the list shrinks after decision

        for(int i =list9.size()-1;i>=0;i--){
            if(list9.get(i)%2!=0){
                list9.remove(i);
            }
        }
        System.out.println(list9); //[2, 4, 6, 8, 44, 66]


        //HOW TO PRINT ARRAYLIST
        //FOUR METHODS
        //A. DIRECT PRINTING
        ArrayList<Integer> list10 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,789,88));
        System.out.println(list10); //[1, 2, 3, 4, 5, 6, 789, 88]
        //B. PRINT USING A NORMAL LOOP
        for(int i=0;i<list10.size();i++){
            System.out.print(list10.get(i)); //12345678988
        }
        System.out.println();
        //C. PRINT USING AN ENHANCED FOR LOOP
        for(int x: list10){
            System.out.print(x); //12345678988
        }
        System.out.println();
        //D. PRINT USING forEach()
        list10.forEach(x -> System.out.print(x)); //12345678988
        System.out.println();



        //HOW TO TAKE INPUT AND STORE IN ARRAYLIST
        int n = sc.nextInt();
        ArrayList<Integer> list11= new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            list11.add(x);
        }
        System.out.println(list11);


        //CONVERSION
        //ARRAYLIST TO ARRAY
        ArrayList<Integer> list12 = new ArrayList<>(Arrays.asList(1,2,3,4,600));
        Integer[] arr19 = list12.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr19));
        //ARRAY TO ARRAYLIST
        Integer[] arr20 = {1,8,6};
        ArrayList<Integer> list13 = new ArrayList<>(Arrays.asList(arr20));
        System.out.println(list13);

        /*
        Method	Purpose	Example
add(x)	Add element at end	list.add(10);
add(i,x)	Insert at index	list.add(1,10);
get(i)	Get element	list.get(0);
set(i,x)	Update element	list.set(0,99);
remove(i)	Remove index	list.remove(0);
remove(Object)	Remove value	list.remove(Integer.valueOf(10));
removeIf()	Remove based on condition	list.removeIf(x -> x < 0);
contains(x)	Check existence	list.contains(10);
size()	Return number of elements	list.size();
isEmpty()	Check empty list	list.isEmpty();
indexOf(x)	First occurrence	list.indexOf(10);
lastIndexOf(x)	Last occurrence	list.lastIndexOf(10);
clear()	Remove all elements	list.clear();
toArray()	Convert to Object array	list.toArray();
toArray(new Integer[0])	Convert to Integer array	list.toArray(new Integer[0]);
         */
        /*
        ArrayList<Integer> list =
        new ArrayList<>(Arrays.asList(10, 20, 30, 40));
ArrayList<Integer> check =
        new ArrayList<>(Arrays.asList(10, 30));
System.out.println(list.containsAll(check));  true


ArrayList<Integer> a =
        new ArrayList<>(Arrays.asList(10, 20));
ArrayList<Integer> b =
        new ArrayList<>(Arrays.asList(30, 40));
a.addAll(b);
System.out.println(a); [10, 20, 30, 40]


ArrayList<Integer> a =
        new ArrayList<>(Arrays.asList(10, 20, 30, 40));

ArrayList<Integer> b =
        new ArrayList<>(Arrays.asList(20, 40));

a.removeAll(b);

System.out.println(a); [10, 30]





ArrayList<Integer> a =
        new ArrayList<>(Arrays.asList(10, 20, 30, 40));

ArrayList<Integer> b =
        new ArrayList<>(Arrays.asList(20, 40));

a.retainAll(b);

System.out.println(a); [20, 40]




ArrayList<Integer> list =
        new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

List<Integer> sub = list.subList(1, 4);

System.out.println(sub);  [20, 30, 40]




ArrayList<Integer> list =
        new ArrayList<>(Arrays.asList(50, 10, 30, 20));

list.sort(null);

System.out.println(list); [10, 20, 30, 50]













Collections Methods
These methods are not ArrayList instance methods. They are static methods of the Collections class.
Method	Purpose	Syntax
Collections.sort()	    Sort ascending	Collections.sort(list);
Collections.reverse()	Reverse order	Collections.reverse(list);
Collections.max()	    Find maximum	Collections.max(list);
Collections.min()	    Find minimum	Collections.min(list);
Collections.frequency()	Count occurrences	Collections.frequency(list,x);
Collections.swap()	    Swap two positions	Collections.swap(list,i,j);
Collections.shuffle()	Randomly shuffle	Collections.shuffle(list);
Collections.binarySearch()	Search sorted list	Collections.binarySearch(list,x);







import java.util.*;

public class Main {

    // Method that receives an ArrayList and returns an ArrayList
    static ArrayList<Integer> solve(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            int x = list.get(i);

            // Example condition: store even numbers
            if (x % 2 == 0) {
                result.add(x);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Input size
        int n = sc.nextInt();

        // 2. Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 3. Parse input
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // 4. Print original list
        System.out.println(list);

        // 5. Call method
        ArrayList<Integer> result = solve(list);

        // 6. Print returned list
        System.out.println(result);

        sc.close();
    }
}

         */

















    }
}
