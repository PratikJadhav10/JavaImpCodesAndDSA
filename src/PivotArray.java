/*Write a Java program for Pivot Array logic.
Given an array and a pivot, balance the array in minimum number of swaps such that:
arr[left] < pivot < arr[right]
*/

import java.util.ArrayList;
import java.util.List;

//expected = 3,5,9,10,10,12,14
public class PivotArray {
    public static void main(String[] args) {
        int[] arr = {9, 12, 3, 5, 14, 10, 10};
        int pivot = 10;
        // System.out.println(pivotArray(arr,pivot));

    }

    public static void pivotArray(int[] arr, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        for (int n : arr) {
            if (n < pivot) {
                less.add(n);
            } else if (n == pivot) {
                equal.add(n);
            } else if (n > pivot) {
                high.add(n);
            }

            //  int[] combinedArray = new int[];

        }
    }
}
