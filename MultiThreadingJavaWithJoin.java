class MyPrinter2{
    void printDoc(int pages, String docName){
        for(int i =1; i <= pages; i++){
            System.out.printf("Printing page %d for %s\n", i, docName);
        }
    }
}

class MathsThread2 extends Thread{
    MyPrinter2 p;
    MathsThread2(MyPrinter2 p){
        this.p = p;
    }
    @Override
    public void run(){
        p.printDoc(10, "Maths");
    }
}

class ScienceThread2 extends Thread{
    MyPrinter2 p;
    ScienceThread2(MyPrinter2 p){
        this.p = p;
    }
    @Override
    public void run(){
        p.printDoc(10, "Science");
    }
}

public class MultiThreadingJavaWithJoin {
    public static void main(String[] args) {
        MyPrinter2 p = new MyPrinter2();
        MathsThread2 m = new MathsThread2(p);
        ScienceThread2 s = new ScienceThread2(p);
        m.start();
        try{
            m.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        s.start();
    }
}
