package ARRAYLIST;
import java.util.ArrayList;
public class BASICS {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        //addign elements
        cars.add("volvo");
        cars.add("bmw");
        cars.add("ford");

        //accessing elements
        String mycar = cars.get(0);
        System.out.println(mycar);

        //changing elements
        cars.set(0,"tata");

        //removing elements
        cars.remove(2);
        cars.clear(); //removes everything

        //loop in arraylist
        for(String car: cars){
            System.out.println(car);
        }
    }
}
