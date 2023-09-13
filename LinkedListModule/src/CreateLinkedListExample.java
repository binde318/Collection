import java.util.LinkedList;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        System.out.println(" Initial elements " + fruits);

        //add element at specific index in linkedlist
        fruits.add(2,"WaterMelon");
        System.out.println("After adding the new element " + fruits);
        //how to add element at the beginning of linkedlist using addFirst() method
        fruits.addFirst("Kel");
        System.out.println(" After adding element at the beginning of the linkedlist :" + fruits);
        //how to add element to the end of the linkedlist using addLast() method.
        fruits.addLast("Cashew");
        System.out.println(" After addLast method :"+ fruits);

    }
}
