package leetcodeDSA;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int slow = 0; //index of last unique number
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow +1;

    }


    static void printPrefix(int[] nums, int k) {
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r1 = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,2,2,3,4,4,5};
        int k = r1.removeDuplicates(nums);
       // System.out.println("Slow:"+r1.removeDuplicates(nums));

        System.out.println("k = " + k);
        System.out.print("Unique sorted prefix: ");
        printPrefix(nums, k);

    }
}
