// A class to find the greatest of three numbers
public class GreatestNumberFinder {

    // Method to find and print the greatest number
    public void findGreatest() {
        double num1 = 1, num2 = 3, num3 = 5;

        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest of the three numbers is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest of the three numbers is " + num2);
        } else {
            System.out.println("The greatest of the three numbers is " + num3);
        }
    }

    public static void main(String[] args) {
        GreatestNumberFinder obj = new GreatestNumberFinder();
        obj.findGreatest();
    }
}
