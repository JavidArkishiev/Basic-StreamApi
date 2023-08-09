package tasks.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("Balaken", "Izmir", "Vancuover", "Moskow");
        List<String> result = list.stream()
//                .sorted(String::compareTo)
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .collect(Collectors.toList());
        System.out.println("Result " + result);
    }
}
