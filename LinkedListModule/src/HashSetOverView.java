import java.util.HashSet;
import java.util.Set;

public class HashSetOverView {
    public static void main(String[] args) {
        nullValueDemo();
        duplicateValueDemo();
        unorderedDemo();

    }
    //set can contain one null value
    private static void nullValueDemo(){
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.toString());
    }
    //it is not contain duplicate value
    private static void duplicateValueDemo(){
        Set<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element1");
        System.out.println(set.toString());

    }
    //it is unordered collection
    private static void unorderedDemo(){
        Set<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element3");
        set.add("Element4");
        set.add("Element6");
        set.add("Element9");
        System.out.println(set.toString());
    }
}
