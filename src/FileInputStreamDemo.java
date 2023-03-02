import java.io.*;


public class FileInputStreamDemo {
    public static void main(String[] args) {

        FileWite();

    }


    public void FileRead(){
        try {
            File f  = new File("D:\\CloudMusic\\1.txt");
            FileInputStream fis =new FileInputStream(f);

            byte[] all = new byte[(int)f.length()];
            fis.read(all);
            for (byte b:all){
                System.out.println((char) b);
            }
            fis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void FileWite(){


        try {
            String pathname ="D:\\CloudMusic\\1\\2.txt";
            File f  = new File(pathname);
            if(!f.getParentFile().exists()){
                f.getParentFile().mkdirs();
            }
            byte data[] ={88,89};
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(data);
            fos.close();
        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
