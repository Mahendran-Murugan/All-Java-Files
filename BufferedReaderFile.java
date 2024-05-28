import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedReaderFile {
    public static void main(String args[]) {
        try {
            FileReader fout = new FileReader("test2.txt");
            BufferedReader reader = new BufferedReader(fout);
            int i = 0;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            reader.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
