import java.util.HashMap;
import java.util.Map;

public class HashmappUserDefineExample {
    public static void main(String[] args) {
        // create hashMap
        Map<Integer, Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1, new Student(" Binde ", " Nannim "));
        studentMap.put(2, new Student(" Ponjul ", " Charles "));
        studentMap.put(3, new Student(" Austine ", " Bulus "));


        System.out.println(studentMap.values());
    }
}
