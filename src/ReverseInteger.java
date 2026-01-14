public class ReverseInteger {
    //1234
    public static void main(String[] args) {
        int num = 1234;
        int reverseInt = reversedInt(num);
        System.out.println("Original Integer: "+num);
        System.out.println("Reversed Integer: "+reverseInt);
    }

    public static int reversedInt(int num){
        int reversed = 0;
        while(num !=0){//1234,123,12
           int digit = num % 10;//digit = 4,3,2
           reversed = (reversed * 10) + digit; // 4,43,432,
           num = num / 10;

        }
        return reversed;
    }
}
