package tasks.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Java is a programming language");
        List<String> result = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Result " + result);
    }
}
