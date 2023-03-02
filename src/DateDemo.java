import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat[] dateArr = new SimpleDateFormat[9];

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
        String s1 = "1970-01-01 00:00:00" ;
        long sl = format.parse(s1).getTime() ;


        System.out.println(sl);
    }

    public void RandomDate(){

    }
}
