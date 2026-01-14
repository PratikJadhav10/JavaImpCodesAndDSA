import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class FourthLargestElementJava8 {
    public static void main(String[] args) {
        int[] arr = {5,2,7,6,1,9,4};

        Optional<Integer> fourthLargest =  Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .distinct().skip(3).findFirst();
        System.out.println("2nd largest"+ fourthLargest);
    }
}
