package Strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Pratik";
        char[] stringChar = {'h', 'e', 'l', 'l', 'o'};
        reverseCharStrings(stringChar);
        System.out.println("Reverse string"+ Arrays.toString(stringChar));

        StringBuilder sb = new StringBuilder(str).reverse();
        System.out.println(sb);
    }

    public static void reverseCharStrings(char[] stringChar){
        int left = 0;
        int right = stringChar.length -1;

        while (left < right){
            char temp = stringChar[left];
            stringChar[left]  =stringChar[right];
            stringChar[right] = temp;

            left++;
            right--;

        }
    }

}
