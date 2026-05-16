package leetcodeDSA;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Pratik";
        System.out.println("Before reverse: "+str);
        System.out.println("After reverse: "+reverseString(str));
    }
    public static String reverseString(String str){

        char[] strArray = str.toCharArray();
        int left = 0;
        int right = str.length() -1;

        while(left < right){
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;
            left++;
            right--;
        }
        String reversed = String.valueOf(strArray);
       // return reversed;
        return new String(strArray);

       // return Arrays.toString(strArray);
    }
}
