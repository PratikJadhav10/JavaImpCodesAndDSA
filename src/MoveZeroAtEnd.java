import java.util.Arrays;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 5};
        moveZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZerosToEnd(int[] nums) {
        int n = nums.length;
        int index = 0; // index to place non-zero elements

        // Move non-zero elements to the beginning
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // Fill the remaining elements with zeros
        while (index < n) {
            nums[index++] = 0;
        }
    }
}
