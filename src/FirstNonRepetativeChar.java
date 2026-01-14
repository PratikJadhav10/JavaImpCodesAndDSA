import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepetativeChar {
    public static void main(String[] args) {
        String s = "fgaabbcdde";

        Character abc = s.chars().mapToObj(n -> (char) n)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("non rep char:"+abc);

    }

}
