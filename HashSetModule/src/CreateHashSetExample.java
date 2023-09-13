import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String[] args) {

        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("C#");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaCript");
        programmingLanguages.add("Java");

        System.out.println(programmingLanguages);

        //let add duplicate element, HashSet does not allow duplicate element
        //hashset internally use hashmap to store element
        programmingLanguages.add("Java");
        System.out.println(programmingLanguages);

    }
}
