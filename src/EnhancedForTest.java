public class EnhancedForTest {
    public static void main(String[] args) {
        int [] array = {23,57,10,12,15,58,69,89,90};
        int total=0;
        for (int number: array)
//        for (int number:array)
             total += number;
        System.out.printf("Total of array Elements: %d%n", total);
    }
}
