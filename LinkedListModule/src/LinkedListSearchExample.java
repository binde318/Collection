import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchExample {
    public static void main(String[] args) {
        LinkedList<String> proLanguage = new LinkedList<>();
        proLanguage.add("C");
        proLanguage.add("C++");
        proLanguage.add("C#");
        proLanguage.add("Python");
        proLanguage.add("Java");
        //To check whether an element is present in the list or not
       boolean result =  proLanguage.contains("Node.js");
        System.out.println(result);
        boolean result1 = proLanguage.contains("C");
        System.out.println(result1);
        // To find the index of an element in a linklist
        int index = proLanguage.indexOf("Python");
        System.out.println(index);
        System.out.println(proLanguage.indexOf("Python"));
        //how to see the index of last occurrence element

        int index1 = proLanguage.lastIndexOf("Java");
        System.out.println(index1);

        //Iterator
        Iterator<String> iterator = proLanguage.iterator();
        while (iterator.hasNext()){
            String prog = (String) iterator.next();
            System.out.println(prog);
        }
        //using forEach method
        proLanguage.forEach((element) -> {
            System.out.println(element);
        });

        //using each advanced loop
        for (String r : proLanguage){
            System.out.println(r);
        }
    }
}
