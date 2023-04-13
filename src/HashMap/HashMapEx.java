package HashMap;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");

        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.keySet());
        hashMap.forEach((k,v) -> System.out.println(k+v));
        hashMap.remove(1);
        hashMap.replace(3,"cat");
        hashMap.forEach((k,v) -> System.out.println(k+v));
        hashMap.clear();
        System.out.println("cleared");
        hashMap.forEach((k,v) -> System.out.println(k+v));
    }
}
