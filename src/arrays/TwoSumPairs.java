package arrays;//print all the pairs of numbers who's target is 5


import java.util.HashSet;

public class TwoSumPairs {
    public static void twoSumPairs(int[] arr, int target){
        int n = arr.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i< n; i++){
            int complement = target - arr[i];

            if(set.contains(complement)){
                System.out.println("Pair:("+complement+","+arr[i]+")");

            }
            set.add(arr[i]);

        }
        //System.out.println("set:"+set);
       // set.stream().forEach(s-> System.out.println("Set Stream"+s));

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        twoSumPairs(arr,target);
    }
}