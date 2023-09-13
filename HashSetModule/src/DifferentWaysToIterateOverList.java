import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Set;

public class DifferentWaysToIterateOverList {
    public static void main(String[] args) {
        //enhanced for loop
        //Basic loop with iterator
        //while loop with Iterator
        //JDK 8 forEach() meth with lambda
        //JDK 8 streaming + forEach() + lambda Expression
        Set<String> Courses = new HashSet<>();
        Courses.add("Java");
        Courses.add("C++");
        Courses.add("C");
        Courses.add("Python");
        //Enhanced for loop
//        for (String course : Courses){
//            System.out.println(course);
//        }
        //Basic for loop with Iterator
//        for (Iterator<String> iterator = Courses.iterator(); iterator.hasNext();){
//           String course = (String) iterator.next();
//            System.out.println(course);
//        }
        //JDK 8 forEach() method
       // Courses.forEach(Course -> System.out.println(Course));

        //JDK 8 streaming + forEach() + lambda Expression
        Courses.stream().filter(Course -> ! "Java".equals(Course))
                .forEach(Course -> System.out.println(Course));

    }
}
