import java.io.File;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) {

        getMaxFiles("D:\\CloudMusic");


    }
    public static void getMaxFiles(String pathname){
        File f = new File(pathname);
        File[] fileArr = f.listFiles();
        File max = fileArr[0];
        for (File file : fileArr) {

            if (max.length() < file.length()) {
                max = file;
            }
        }
        System.out.println(max.getAbsoluteFile());

        System.out.println(max.length());
    }


}


