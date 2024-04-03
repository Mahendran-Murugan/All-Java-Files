import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExtractNoFromString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            in.next();
            String s = in.nextLine();
            String[] arr =s.split(" ");
            ArrayList<Integer> l = new ArrayList<Integer>();
            for(String i: arr){
                try{
                    int n = Integer.valueOf(i);
                    l.add(n);
                }catch(Exception e){
                    continue;
                }
            }
            if(l.isEmpty()){
                System.out.println("-1");
            }else{
                Collections.sort(l);
                System.out.println(l.getLast());
            }
        }
        
    }
}
