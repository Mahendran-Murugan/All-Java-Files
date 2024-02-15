import javax.print.Doc;

interface Printables{
    void print();
} 

class Printer implements Printables{
    public void print(){
        System.out.println("This is Printer");
    }
}

class Scanner implements Printables{
    public void print(){
        System.out.println("This is Scanner");
    }
}

class Fax implements Printables{
    public void print(){
        System.out.println("This is Fax");
    }
}

class Documents{
    Printables p;
    Documents(Printables p){
        this.p = p;
    }
    public void printDocs(){
        this.p.print();
    }
}

public class InterFace {
    public static void main(String[] args) {
        Printables p = new Printer();
        Printables s = new Scanner();
        Printables f = new Fax();

        Documents d1 = new Documents(p);
        Documents d2 = new Documents(s);
        Documents d3 = new Documents(f);

        d1.printDocs();
        d2.printDocs();
        d3.printDocs();
    }
}
