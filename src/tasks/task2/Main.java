package tasks.task2;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4, 6, 7, 8, 9);
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Map<Boolean, List<Integer>> result = list
                .stream()
                .collect(Collectors.partitioningBy(predicate));
        List<Integer> even = result.get(true).stream().collect(Collectors.toList());
        List<Integer> odd = result.get(false).stream().collect(Collectors.toList());
        System.out.println("Even " + even);
        System.out.println("Odd " + odd);

    }
}
