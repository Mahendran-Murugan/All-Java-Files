class MyPrinter{
    void printDoc(int pages, String docName){
        for(int i =1; i <= pages; i++){
            System.out.printf("Printing page %d for %s\n", i, docName);
        }
    }
}

class MathsThread extends Thread{
    MyPrinter p;
    MathsThread(MyPrinter p){
        this.p = p;
    }
    @Override
    public void run(){
        p.printDoc(10, "Maths");
    }
}

class ScienceThread extends Thread{
    MyPrinter p;
    ScienceThread(MyPrinter p){
        this.p = p;
    }
    @Override
    public void run(){
        p.printDoc(10, "Science");
    }
}

public class MultiThreadingJava {
    public static void main(String[] args) {
        MyPrinter p = new MyPrinter();
        MathsThread m = new MathsThread(p);
        ScienceThread s = new ScienceThread(p);
        m.start();
        s.start();
    }
}
