package Collections.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);   
        l.add(2);   
        l.add(3);
           
        ArrayList a = new ArrayList();
        l.add(1);   
        l.add(2);   
        l.add(3);
        
        l.addAll(a);

        System.out.println(l);
    }
}