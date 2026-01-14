package arrays;

import java.util.HashMap;

public class TwoSumHashMap {



    // Function to check whether any pair exists
    // whose sum is equal to the given target value
    static boolean twoSum(int[] arr, int target){

        // Create a HashMap to store the elements
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {

            // Calculate the complement that added to
            // arr[i], equals the target
            int complement = target - arr[i];

            // Check if the complement exists in the set
            if (map.containsKey(complement)) {
                return true;
            }

            // Add the current element to the map
            map.put(arr[i], i);
        }
        // If no pair is found
        return false;
    }

    public static void main(String[] args){

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = 0;

        // Call the twoSum function and print the result
        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

