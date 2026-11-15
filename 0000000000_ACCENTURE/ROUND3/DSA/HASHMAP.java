package HASHING;

import java.util.*;
public class BASICS {
    public static void main(String[] args) {
        //CREATE A HASHMAP
        HashMap<Integer, Integer> map1 = new HashMap<>();
        //HashMap<KeyType, ValueType> map = new HashMap<>();
        /*
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<String, String> map = new HashMap<>();
         */

        //INSERT, ACCESS, UPDATE AND DELETE
        //INSERT
        map1.put(1,100);
        map1.put(2,101);
        map1.put(3,102);

        //PRINT
        System.out.println(map1); //{1=100, 2=101, 3=102}

        //ACCESS
        System.out.println(map1.get(2)); //101

        //CHECK KEY
        System.out.println(map1.containsKey(3)); //true

        //DELETE
        map1.remove(3);

        //SIZE
        System.out.println(map1.size()); //2

        //IMPORTANT
        map1.put(3,102);
        map1.put(3,333);
        System.out.println(map1); //{1=100, 2=101, 3=333}
        //put() PERFORMS BOTH INSERTION AND UPDATING




        //getOrDefault()

        HashMap<Integer,Integer> map2 = new HashMap<>();
        map2.put(10,1000);
        System.out.println(map2.getOrDefault(10,0)); //1000
        System.out.println(map2.getOrDefault(20,0)); //0

        //suppose you want to count the frequency of an element
        //so very basic code would be to do this
        int num = 30;
        if(map2.containsKey(num)){
            map2.put(num,(map2.get(num)+1));
        }else{
            map2.put(num,1);
        }
        //so instead of this code
        //simple write
        map2.put(num,map2.getOrDefault(num,0)+1);
        System.out.println(map2);


        //HASHMAP INTERVAL HOW TO PRINT AND PARSE
        //METHOD 1 keySet()
        for(Integer key: map1.keySet()){
            System.out.print(key); //123
        }
        System.out.println();

        //METHOD 2 values()
        for(Integer value: map1.values()){
            System.out.println(value); // 100 101 333
        }

        //METHOD 3 entrySet()
        for(HashMap.Entry<Integer,Integer> entry: map1.entrySet()){
            System.out.print(entry.getKey()+ "->"+entry.getValue());
        } //1->100 2->101 3->333
        System.out.println();


        //METHOD 3 forEach()
        map1.forEach((key,value)->
                System.out.println(key+ " -> "+value) //1->100 2->101 3->333

        );



    }
}
