import java.util.Arrays;

public class HexawareAnagram {
    public static boolean anagram(String s1, String s2){

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array,s2Array);

    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        anagram(s1, s2);
    }
}
