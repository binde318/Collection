import java.util.HashSet;
import java.util.Set;

public class CreateHashSetfromCollection {
    public static void main(String[] args) {
        Set<Integer> firstFiveEvenNumber = new HashSet<>();
        firstFiveEvenNumber.add(2);
        firstFiveEvenNumber.add(4);
        firstFiveEvenNumber.add(6);
        firstFiveEvenNumber.add(8);
        firstFiveEvenNumber.add(10);

        Set<Integer> tenEvenNumber = new HashSet<>(firstFiveEvenNumber);
        //System.out.println(tenEvenNumber);

        Set<Integer>nextFiveEvenNumbers = new HashSet<>();
        nextFiveEvenNumbers.add(12);
        nextFiveEvenNumbers.add(14);
        nextFiveEvenNumbers.add(16);
        nextFiveEvenNumbers.add(18);
        nextFiveEvenNumbers.add(20);
        //add all element from collections to hashset using addAll method.
        tenEvenNumber.addAll(nextFiveEvenNumbers);
        System.out.println(tenEvenNumber);


    }
}
