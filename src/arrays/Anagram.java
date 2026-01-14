package arrays;
// Java Code to check if two Strings are anagrams of
// each other using sorting

import java.util.Arrays;

class Anagram {

    // Function to check if two strings are anagrams
    static boolean areAnagrams(String s1, String s2) {

        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        System.out.println("s1Array before sort: "+Arrays.toString(s1Array));
        System.out.println("s2Array before sort: "+Arrays.toString(s2Array));
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        System.out.println("s1Array after sort: "+ Arrays.toString(s1Array));
        System.out.println("s2Array after sort: "+ Arrays.toString(s2Array));

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(areAnagrams(s1, s2));
    }
}
