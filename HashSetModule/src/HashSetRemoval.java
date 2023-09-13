import java.util.HashSet;
import java.util.Set;

public class HashSetRemoval {
    public static void main(String[] args) {
        //creating HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        boolean result = numbers.remove(1);
        //System.out.println(numbers.remove(1));
        //System.out.println("remove method result -> " + result);
        //System.out.println(numbers);
       // System.out.println(numbers);
        Set<Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);
        evenNumber.add(10);
//using removeAll() method
        numbers.removeAll(evenNumber);
        System.out.println(numbers);
        //clear () method
        numbers.clear();
        System.out.println(numbers);


    }
}
