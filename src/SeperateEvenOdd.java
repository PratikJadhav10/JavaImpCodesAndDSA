import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateEvenOdd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,5,7,11,15,19,21,29,34,18);

        Map<Boolean, List<Integer>> evenOdd = nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 ==0));

        System.out.println(evenOdd.get(true));
        System.out.println(evenOdd.get(false));

    }
}
