import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] value = {5, 6, 7, 8, 9, 22, 78};
        System.out.print("Original values");
        IntStream.of(value)
                .forEach(value1 -> System.out.printf("%d", value1));
        System.out.println();
        // count, min, max, sum and average of the values
        System.out.printf("%ncount : %d%n", IntStream.of(value).count());
        System.out.printf("%nmin :%d%n", IntStream.of(value).min().getAsInt());
        System.out.printf("%nMax :%d%n", IntStream.of(value).max().getAsInt());
        System.out.printf("%nSum :%d%n", IntStream.of(value).sum());
        System.out.printf("Average:%.2f%n", IntStream.of(value).average().getAsDouble());
        // sum of values with reduce method
        System.out.printf("%nSum via reduce : %d%n", IntStream.of(value).reduce(0, (x, y) -> x + y));
        // sum of squares of values with reduce method
        System.out.printf("%nSum via reduce : %d%n", IntStream.of(value).reduce(0, (x, y) -> x + y * y));
// product of values with reduce method
        System.out.printf("Product via reduce method: %d%n", IntStream.of(value).reduce(1, (x, y) -> x * y));
        // even values displayed in sorted order
//        System.out.printf("", IntStream.of(value).filter(value1 -> value1 % 2 == 0).sorted()
//                .forEach(value1 -> System.out.printf("", value1)));
//        System.out.printf("",IntStream.of(value)
//                .filter(value1 -> value1 % 2 == 0)
//                .sorted()
//                .forEach(value1 -> System.out.printf("Even number: %d%n", value1));
//                IntStream.of(value).filter(value1 -> value1 % 2 == 0)
//                        .sorted()
//                        .forEach(value1 -> System.out.printf("%d ", value1)));
        System.out.println();
        // odd values multiplied by 10 and displayed in sorted order
        System.out.printf("Odd value multiply by 10 in sorted order :");
        IntStream.of(value)
                .filter(value1 -> value1 % 2 != 0)
                .map(value1 -> value1 * 10)
                .sorted()
                .forEach(value1 -> System.out.printf("%d ", value1));
        System.out.println();
        // sum range of integers from 1 to 10, exlusive
        System.out.printf("%Sum of integer form 1 to 9 : %d%n", IntStream.range(1,10).sum());
        // sum range of integers from 1 to 10, inclusive
        System.out.printf("Sum of integers ranging form 1 to 10 : %d%n", IntStream.rangeClosed(1,10).sum());



    }
}
