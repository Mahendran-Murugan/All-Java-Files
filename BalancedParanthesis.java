import java.util.Stack;
import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Stack<Character> s = new Stack<Character>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '{'){
                s.add('}');
            }
            else if(str.charAt(i) == '('){
                s.add(')');
            }
            else if(str.charAt(i) == '['){
                s.add(']');
            }else {
                if(!s.isEmpty() && str.charAt(i) == s.peek()){
                    s.pop();
                }else{
                    s.add('{');
                }
            }
        }
        str = s.isEmpty() ? "Valid" : "Not Valid";
        System.out.println(str);
    }
}
