package leetcode;

public class ReverseVowelsofaString {
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while(left < right){
            while(left < right && !isVowel(ch[left])){
                left ++;
            }
            while(left < right && !isVowel(ch[right])){
                right--;
            }
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        return new String(ch);
    }
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
