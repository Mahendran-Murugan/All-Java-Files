import java.util.Scanner;

public class RotateTheString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String s1 = "", s2 = "";
        int n = in.nextInt();
        int len = s.length();
        char direction = in.next().charAt(0); 
        boolean flag = true;
        if(direction == 'L') flag = false;
        if(flag){
            n = len - n;
        }
        for(int i =0; i < len; i++){
            if(i < n){
                s1 += s.charAt(i);
            }else{
                s2 += s.charAt(i);
            }
        }
        s1 = s2+s1;
        System.out.println(s1);
    }
}
