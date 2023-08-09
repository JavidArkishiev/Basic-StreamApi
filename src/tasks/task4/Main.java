package tasks.task4;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 6, 8, 10, 11, 12, 13);
        int sum = list.stream()
                .map(n -> n * n * n).reduce(0, (x, y) -> x + y);
        System.out.println("Sum " + sum);

    }
}
