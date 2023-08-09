package tasks.task5;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String capital = "Ottawa is a Capital of Canada";
        List<String> list = List.of(capital.split(" "));
        List<String> result = list.stream()
                .filter(n -> n.length() > 4).sorted()
                .collect(Collectors.toList());
        System.out.println("Result " + result);

    }
}
