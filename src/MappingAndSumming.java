import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Given a list of integers,
// square each number and then
// find the sum of the squared numbers.
public class MappingAndSumming {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,4);
        int sum = num.stream()
                .mapToInt(n -> n*n).sum();
        System.out.println("Sum: "+sum);

        //Given a list of strings,
        // find the longest string using Stream API.
        List<String> list = Arrays.asList("cat","tiger", "elephant", "lion");

        String largestString = list.stream()
                .max(Comparator.comparingInt(String::length)).orElseThrow(() -> new RuntimeException());
        System.out.println(largestString);
    }
}




