package arrays;

public class TwoSum {

    public static boolean twoSum(int[] arr, int target){

        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = i+1; j< n; j++) {
              if(arr[i]+arr[j] == target){
                  System.out.println("Sum is equal to target");
                  return true;
              }
            }
        }
        System.out.println("sum is not equal to target");

        return false;
    }

    public static void main(String[] args) {
        int[] array = {4,-1,2,-7,2,1};
        int target = 3;
        twoSum(array,target);
    }
}
