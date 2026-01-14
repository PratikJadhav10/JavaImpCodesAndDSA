
/*
1. Length of Last Word in String

I/P-1: "Hello World"
O/P: 5

I/P-2: "     Hello     World     "
O/P: 5

I/P-3: "Hello     World!"
O/P: 5

I/P-4: "Hello World....."
O/P: 5
*/

public class LengthOfLastWord {
    public static int lenghtWord(String word){
        int lastWord;
        if(word == null){
            return 0;
        }
        word = word.trim();
        int count = 0;
        lastWord = word.lastIndexOf(word);
        for (int i=word.length()-1; i>0;i--){
            boolean abc = word.contains(" ");
            //check punctuation in if block using regex
            if(abc){
                break;
            }
            count++;

        }


        return count ;


    }


    public static void main(String[] args) {
        int[] num = {2,5,8,7,4};

        String word = "Hello World";
        System.out.println(lenghtWord(word));

    }
}
