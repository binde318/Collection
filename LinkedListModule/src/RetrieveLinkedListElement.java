import java.util.LinkedList;

public class RetrieveLinkedListElement {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Guava");
        fruits.add("Ginger");
        fruits.add("Mango");

        //getting the first element from the linkedlist using getFirst() method

        String firstElement = fruits.getFirst();
        System.out.println(" The first element from the linkedlist => " + firstElement);
        //System.out.println(" The first element in the list => " + fruits.getFirst());
        // getting last element in the linked list using getLast() method

        String lastElement = fruits.getLast();
        System.out.println(" The last element in the linked list is => " + lastElement);

        //how to get element at the specific position in linkedlist
        String element = fruits.get(1);
        System.out.println(" The element at index 1 is => " + element);

        //to loop through the element
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
