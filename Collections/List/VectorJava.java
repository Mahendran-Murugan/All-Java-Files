package Collections.List;

import java.util.Scanner;
import java.util.Vector;

public class VectorJava {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
           v.add(in.nextInt()); 
        }
        System.out.println(v);
    }
}
