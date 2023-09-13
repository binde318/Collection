import com.sun.jdi.Value;

import java.util.*;

public class CreateHashMapExample {
    public static void main(String[] args) {
        //example to map numbers to string
        Map<String, Integer> numberMapping = new HashMap<>();

        // how to add key-value pair to map
        numberMapping.put("one", 1);
        numberMapping.put("two", 2);
        numberMapping.put("three", 3);
        numberMapping.put("four", 4);
        numberMapping.put("five", 5);
//can add only one null key and it can replace the existing null entry

        numberMapping.put(null, 7);
        System.out.println(numberMapping);

        //To check if the map is empty
       // boolean result = numberMapping.isEmpty();
        System.out.println(numberMapping.isEmpty());

        //How to find the size of the map, we use te size() method
       // int result = numberMapping.size();
        System.out.println(numberMapping.size());

        // To check if a ke exist in a mapp
        if (numberMapping.containsKey("five")){
            System.out.println(" It does exist");
        }else{
            System.out.println("It does not exist");
        }
        //how to check if value exist
        if (numberMapping.containsValue(4)){
            System.out.println(" The value does exist");

        }else {
            System.out.println(" The value does not exist");
        }
        //how to get value by specific key
        Integer v2 = numberMapping.get("two");
        System.out.println(v2);
        //How to remove keys from map
        numberMapping.remove("one");
        System.out.println(numberMapping);

        //How to get only keys from the hashMap
        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

        //how to get the values from map

        Collection<Integer> values = numberMapping.values();
        System.out.println(values);


        //Different ways to iterate over hashmap
        //for each method
        for (Map.Entry<String, Integer> entry : numberMapping.entrySet()){
            System.out.println("Key => " + entry.getKey() + " Value => " + entry.getValue());

        }

        // using iterator
        Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();

            System.out.println(" Key -> " + entry.getKey() + " Value -> " + entry.getValue());


            //hashmap using forEach() method

            numberMapping.forEach((K, V) -> {
                System.out.println(" K " + K);
                System.out.println(" V " + V);
            });
        }
    }
}
