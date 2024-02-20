import java.util.Scanner;
import java.util.*;

public class CollectionIterator {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            name.add(in.next());
        }
        Iterator iter = name.iterator();
        while (iter.hasNext()) {
            if(iter.next().equals("adam")){
                iter.remove();
            }
        }
        System.out.println(name);
    }
}
