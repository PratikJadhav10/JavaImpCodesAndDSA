import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {

        String s = "[{()}]";
    }

    public  static void validparanthes(String s){
        char[] charArray = s.toCharArray();
        Stack<Character> stackobj = new Stack<>();

        for(char ch: charArray){
            if(ch == '(' || ch == '{' || ch == '['){
                stackobj.push(ch);
            }
            else {
                if( ch == ')'){
                   // stackobj
                }
            }

        }



    }
}
