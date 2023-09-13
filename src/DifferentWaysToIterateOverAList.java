import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverAList {
    public static void main(String[] args) {
        //will print elements in array format
//        List<String> courses = new ArrayList<>();
//        courses.add("English");
//        courses.add("Mathematics");
//        courses.add("Bilogy");
//        for (int k = 0; k < courses.size(); k++){
//            System.out.println(courses);
//            System.out.println(k);
//        }
        List<String> courses = Arrays.asList("C","C++", "JAVA", "Python","PHP");
        //using for loop to iterate over element
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }

            //Enhanced forEach loop
            for (String course : courses) {
                System.out.println(course);
            }

                //basic loop with iterator
               for (Iterator iterator = courses.iterator(); iterator.hasNext();){
                   String Course = (String) iterator.next();
                   System.out.println(Course);
               }
               //Iterator with while loop
        Iterator<String> iterator = courses.iterator();
               while (iterator.hasNext()){
                   String Course = (String) iterator.next();
                   System.out.println(Course);
               }
               //using Java 8 and lambda example
        courses.stream().forEach(Course -> System.out.println(Course));
               //Java 8 forEach method with Lambda
        courses.forEach((Course) -> System.out.println(Course));

            }

        }

