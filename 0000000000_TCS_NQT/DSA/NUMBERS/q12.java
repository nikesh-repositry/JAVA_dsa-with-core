//factors of the number
package NUMBERS;
import java.util.ArrayList;
import java.util.Collections;
public class q9 {
    public static void main(String[] args) {
        int n = 9;
        ArrayList<Integer> fac = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                fac.add(i);
                if(i!=n/i){
                    fac.add(n/i);
                }
            }
        }
        Collections.sort(fac);
        System.out.println(fac);
    }
}
