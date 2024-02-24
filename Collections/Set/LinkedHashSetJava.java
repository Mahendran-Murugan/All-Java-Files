
package Collections.Set;

import java.util.*;
import java.util.Scanner;

public class LinkedHashSetJava {
    public static void main(String[] args) {
        Set s = new LinkedHashSet();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            s.add(in.nextInt());
        }
        System.out.println(s);
    }
}
