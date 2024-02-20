import java.util.Scanner;
import java.util.*;

public class CollectionWithoutIterator {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            name.add(in.next());
        }
        for(int i = 0; i < name.size(); i++){
            if(name.get(i).equals("adam")){
                name.remove(i);
            }
        }
        System.out.println(name);
    }
}
