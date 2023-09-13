import java.util.ArrayList;
import java.util.List;

public class AccessingElementFromArrayList {
    public static void main(String[] args) {
        List<String> topProgrammingLanguage = new ArrayList<>();

//checking if the array is empty.
        System.out.println(" Is the top Programming Language is empty? :" + topProgrammingLanguage.isEmpty());

        topProgrammingLanguage.add("Java");
        topProgrammingLanguage.add("C++");
        topProgrammingLanguage.add("DotNet");
        topProgrammingLanguage.add("Python");
        topProgrammingLanguage.add("C");
        //find the size of the array
        System.out.println(topProgrammingLanguage.size() + "" + " are the top programming languages in teh world ");
        System.out.println(topProgrammingLanguage.equals("Ada"));
        //how to retrieve the elements in the arraylist using their index
        String bestProgrammingLanguage = topProgrammingLanguage.get(0);
        System.out.println(" bestProgrammingLanguage => " + bestProgrammingLanguage);

        String secondBestProgrammingLanguage = topProgrammingLanguage.get(3);
        System.out.println(" The second best programming Language is : => " + secondBestProgrammingLanguage);

        //how to modify the
        topProgrammingLanguage.set(3,"PHP");
        System.out.println(topProgrammingLanguage);
    }
}
