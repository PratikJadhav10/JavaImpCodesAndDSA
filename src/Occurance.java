import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance {
    public static void main(String[] args) {
        String str = "Praattik";
        char[] ch = str.toCharArray();

        Map<Character, Long> obj = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        obj.forEach((a, b) -> System.out.println(a + ":" + b + ""));


    }
}
