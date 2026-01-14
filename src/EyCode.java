import java.util.HashSet;

public class EyCode {

    public static void sum(int[] arr, int target){

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< arr.length; i++){

            int add = target - arr[i];

            if(set.contains(add)){

                System.out.println("Number:"+arr[i]+","+add);
            }

            set.add(arr[i]);

        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,0,-8,-5,3};
        int target = 3;
        sum(arr, target);


    }
}
