package arrays;

import java.util.*;

/*You are given a list of words. Group the words that are
anagrams of each other together.
(Anagrams are words that have the same letters but in a different order,
like "eat" and "tea").

For example:
Input:
words = ["eat", "tea", "tan", "ate", "nat", "bat"]
Output:
        [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]*/
 public class AnagramGroup {
     public static void main(String[] args) {
         String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
         //AnagramGroup obj = new AnagramGroup();
         List<List<String>> result = anagramGroup(words);
         System.out.println(result);

     }
    public static List<List<String>> anagramGroup(String[] words){
        Map<String,List<String>> map = new HashMap<>();
        for(String word: words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
