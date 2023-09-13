import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //list allow duplicate values
//        list.add("Mike");
//        list.add("Mike");
//        list.add("White");
//        list.add("White");
//        System.out.println(list);
////List allow null value
//        list.add(null);
//        list.add(null);
//        System.out.println(list);
//        System.out.println(list.indexOf("White"));
//        //list allow insertion order
        list.add("element1");
        list.add("element2");
        list.add("element4");
        list.add("element3");
        list.add("element5");
        System.out.println(list);

        //access element from list
        System.out.println(list.get(4));
        System.out.println(list.get(0));
    }
}
