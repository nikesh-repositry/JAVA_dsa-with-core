package ARRAYS;
import java.util.Scanner;
public class BASIC_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //method 1 to create an array
        int[] arr1 = {10,20,30,10};
        //printing arr1 reference
        System.out.println(arr1);     //[I@7b23ec81


        //accessing values via its corresponding index in the array
        System.out.println(arr1[2]);  //


        //modifying the array
        arr1[3]=40;
        System.out.println(arr1[3]);  //40


        //method 2 to create an array
        int[] arr2 = new int[5]; //5 is the size of array and its index will be from 0 to 4
        arr2[0] = 12;  //inserting the value in the array
        arr2[1] = 13;
        arr2[2] = 14;


        //printing values of an array using loops
        int [] arr3 = {1,56,56,58,99,4,0};
        for(int i=0; i<=6;i++){                    //using for loop
            System.out.print(arr3[i]+" ");         //1 56 56 58 99 4 0
        }
        System.out.println();
        int i1 = 0;
        while(i1<7){                               //using while loop
            System.out.print(arr3[i1]+" ");        //1 56 56 58 99 4 0
            i1++;
        }
        System.out.println();


        //length property of array
        System.out.println(arr3.length);      //7


        //by default arrays values are 0
        int[] arr4 = new int[4];
        int i2 =0;
        while(i2< arr4.length){
            System.out.print(arr4[i2]);      //0000
            i2++;
        }
        System.out.println();


        //input in array
        int[] arr5 = new int[5];
        for(int i=0; i<arr5.length;i++){
            arr5[i] = sc.nextInt();
        }
        for(int i=0; i<arr5.length;i++){
            System.out.print(arr5[i]+" ");
        }
        System.out.println();
    }
}
