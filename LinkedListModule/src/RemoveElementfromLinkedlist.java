import java.util.LinkedList;

public class RemoveElementfromLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> fruitList = new LinkedList<>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Cassiya");
        fruitList.add("Tomato");

        System.out.println(" Initials element " + fruitList);
        // removing the first element from the linkedlist
        String firstElement = fruitList.removeFirst();
        System.out.println(firstElement);
        System.out.println(" After removing the first element " + fruitList);
        // how to remove the last elemenet in the link list
        String element = fruitList.removeLast();
        System.out.println(" After removing the last element " + element);
        System.out.println(fruitList);
        // how to remove a specific element in linkedlist
        fruitList.remove(0);
        System.out.println(fruitList);

        //clear method
        fruitList.clear();
        System.out.println(" After clearing the element " + fruitList);
    }
}
