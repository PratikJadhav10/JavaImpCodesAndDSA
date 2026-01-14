import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String words = "aaabbbbcccaabbcc";

        Map<Character, Long> charFrequency =  words.chars()
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charFrequency.forEach((character, frequency) -> {
            System.out.println("Character: " + character + ", Frequency: " + frequency);
        });
    }
}
