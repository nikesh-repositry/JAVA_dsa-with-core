package NUMBERS;
//leap year or not
public class q6 {
    public static void main(String[] args) {
        int y = 2004;
        if(y%400==0 || (y%4==0 && y%100!=0)){
            System.out.println("leap");
        }else{
            System.out.println("not");
        }
    }
}
/*
The year is a leap year if either:

Divisible by 400, or

Divisible by 4 but not divisible by 100.*/
