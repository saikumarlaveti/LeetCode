package LeetcodeConcepts.Hashing;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> clothes = new HashMap();

        //insert values
        clothes.put("Shirt",500);
        clothes.put("Pant",750);
        clothes.put("short",250);
        System.out.println(clothes);

        //get values
        System.out.println(clothes.get("Shirt")); // 500
        System.out.println(clothes.get("Belt"));  // null

        //remove values
        System.out.println(clothes.remove("Shirt"));
        System.out.println(clothes);

        //isEmpty
        System.out.println(clothes.isEmpty());  //false

        //size()
        System.out.println(clothes.size());  // 2


        //Iteration
        Set<String> key = clothes.keySet();
        System.out.println(key);

        for(String k :key){
            System.out.println(k +",Values " + clothes.get(k));
        }
    }
}
