import java.util.HashSet;
import java.util.Set;

public class DuplicateChars {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'd', 'd'};

        Set<Character> setobj = new HashSet<>();

        for (char n: arr){
            setobj.add(n);
        }

        System.out.println(setobj);
    }
}
