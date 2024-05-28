import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputandOutputStream {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("test2.txt");
            String s = "Welcome to LeSuccess";
            byte b[] = s.getBytes();
            // converting string into byte array
            System.out.println();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileInputStream fin = new FileInputStream("test2.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
