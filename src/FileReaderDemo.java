import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        File f = new File("D:\\CloudMusic\\1.txt");

        try(FileReader fr = new FileReader(f)){
            char[] all =new char[(int) f.length()];
            fr.read(all);
            for (char b: all) {
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
