import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        System.out.println(getString(5));

        Man man = new Man();
        System.out.println(man instanceof Man);
    }
    public static String getString(int length){
        char[] arr = new char[length];

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            double r = Math.random();
            int type =(int)(r*3);//随机生成三个类型
            switch (type) {
                //生成数字字符
                case 0 -> {
                    int n = 48;
                    int m = 57;
                    int s = random.nextInt(m) % (m - n + 1) + n;
                    arr[i] = (char) s;
                }
                //生成小写字符
                case 1 -> {
                    int n1 = 65;
                    int m1 = 90;
                    int s1 = random.nextInt(m1) % (m1 - n1 + 1) + n1;
                    arr[i] = (char) s1;
                }
                //生成大写字符
                case 2 -> {
                    int n2 = 97;
                    int m2 = 122;
                    int s2 = random.nextInt(m2) % (m2 - n2 + 1) + n2;
                    arr[i] = (char) s2;
                }
            }
        }


        StringBuilder str5 = new StringBuilder();
        for (char str : arr) {
            str5.append(str);
        }
        return str5.toString();


    }
}