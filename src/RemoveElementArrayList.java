import java.util.ArrayList;
import java.util.List;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        List<String> topWorldPlayer = new ArrayList<>();
        //removing element from arraylist
        topWorldPlayer.add("Messi");
        topWorldPlayer.add("Mikel");
        topWorldPlayer.add("Musa");
        topWorldPlayer.add("Marthins");
        topWorldPlayer.add("Tores");
        topWorldPlayer.remove(1);
        System.out.println(topWorldPlayer);

        System.out.println(topWorldPlayer.size());
        topWorldPlayer.set(0,"Binde");
        System.out.println(topWorldPlayer);
        //remove all the element method
        List<String> subString = new ArrayList<>();
        subString.add("Binde");
        subString.add("Musa");
        topWorldPlayer.removeAll(subString);
        System.out.println(topWorldPlayer);

        //clear method.
        topWorldPlayer.clear();
        System.out.println(topWorldPlayer);
    }
}
