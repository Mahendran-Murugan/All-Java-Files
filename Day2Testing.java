import java.io.*;

// Encapsulation, Inheritance, Polymorphism

class Grandparent {
    public void printCurrentClass() {
        System.out.println("grand parent");
    }
}

class Parent extends Grandparent {
    @Override
    public void printCurrentClass() {
        System.out.println("parent");
    }
}

class Student1 extends Parent {
    private String name;
    private int age;

    Student1() {
        name = "Mahi";
        age = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shapeCalc(int a) {
        System.out.println("Square");
    }

    public void shapeCalc(int a, int b) {
        System.out.println("Rectangle");
    }

    @Override
    public void printCurrentClass() {
        super.printCurrentClass();
    }
}

class Student2 extends Parent {
    private String name;
    private int age;

    Student2() {
        name = "Mahi";
        age = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Day2Testing extends Student1 {
    public static void main(String[] args) throws IOException {
        // int x = 100;
        // System.out.printf("Printing simple" + " integer: x = %d\n", x);
        // System.out.printf("Formatted with" + " precision: PI = %.3f\n", Math.PI);
        float n = 5.2f;
        // System.out.printf("Formatted to " + "specific width: n = %.4f\n", n);
        n = 2324435.3f;
        System.err.printf("Formatted to " + "right margin: n = %13.4f\n", n);

        // InputStreamReader in = new InputStreamReader(System.in);
        // int ch;
        // while ((ch = in.read()) != '0') {
        // System.out.println((char) ch);
        // }

        // String m = "Mahendran";
        // byte[] b = m.getBytes();
        // for (byte i : b) {
        // System.out.println((char) i);
        // }
        // FileOutputStream fout = new FileOutputStream(new File("Tester.txt"));
        // String str = "Mahendran is Learning Java";
        // byte[] b = str.getBytes();
        // fout.write(b);
        // System.out.println("Writing Successfull");
        // fout.close();

        // String name = "Mahendran";
        // byte[] b = name.getBytes();
        // FileOutputStream fout = new FileOutputStream(new File("Text.txt"));
        // fout.write(b);
        // fout.close();

        // FileInputStream fin = new FileInputStream(new File("Text.txt"));
        // int c;
        // while ((c = fin.read()) != -1) {
        // System.out.print((char) c);
        // }
        // fin.close();

        BufferedReader reader = new BufferedReader(new FileReader(new File("Text.txt")));
        // int i = 0;
        // while ((i = reader.read()) != -1) {
        // System.out.print((char) i);
        // }
        // System.out.println(reader.readLine());
        // reader.close();

        // BufferedWriter writer = new BufferedWriter(new FileWriter(new
        // File("Text.txt")));
        // String s = "Mahendran M";
        // writer.write(s);
        // writer.close();

        // FileInputStream fin = new FileInputStream(new File("Tester.txt"));
        // int b;
        // while ((b = fin.read()) != -1) {
        // System.out.print((char) b);
        // }
        // fin.close();

        // BufferedReader reader = new BufferedReader(new FileReader(new
        // File("Tester.txt")));
        // String str;
        // while ((str = reader.readLine()) != null) {
        // System.out.print(str);
        // }
        // reader.close();

        // BufferedWriter writer = new BufferedWriter(new FileWriter(new
        // File("Tester.txt")));
        // String s = "mahendran is awsome";
        // writer.write(s);
        // writer.close();

        // Day2Testing day2 = new Day2Testing();
        // day2.setName("Mahendran");
        // System.out.println(day2.getName());
        // day2.shapeCalc(10);
        // day2.shapeCalc(10, 20);
        // day2.printCurrentClass();
    }
}
