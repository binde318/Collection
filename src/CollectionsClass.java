import java.util.ArrayList;
import java.util.Collection;

public class CollectionsClass {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Apple");
        fruitCollection.add("Orange");
        fruitCollection.add("Pineapple");
        fruitCollection.add("Melon");
        fruitCollection.add("Carrot");
        fruitCollection.add("Lemon");
        System.out.println(fruitCollection);

        fruitCollection.equals("Whites");
        System.out.println(fruitCollection);

        //fruitCollection.contains("Whites");
        System.out.println(fruitCollection);
        fruitCollection.contains("Apple");
        System.out.println(fruitCollection);
        fruitCollection.remove("Apple");
        System.out.println(fruitCollection);
        System.out.println(fruitCollection.size());
        System.out.println(fruitCollection.contains("White"));
        fruitCollection.forEach((element) ->{
            System.out.println(element);
        });

        fruitCollection.clear();
        System.out.println(fruitCollection);
    }
}
