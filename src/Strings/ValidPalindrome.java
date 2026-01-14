package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        //121, 1331

        int num = 121;
        palindromeCheck(num);

    }

    public static void palindromeCheck(int num){
        int n = num;
        int reversed = 0;
        while (n!=0){
           int digit = n % 10; //
            reversed = (reversed *10)+digit;
            n = n /10;

        }
        if (reversed == num){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println("Reversed:"+reversed);

    }
}
