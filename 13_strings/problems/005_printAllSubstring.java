package STRINGS;

public class q3 {
    public static void main(String[] args) {
        String str = "9845";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
