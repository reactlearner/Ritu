package loops;

public class StringExample {

    // int, long, float, double, boolean, char
    String s = "today is monday";
    String s3 = "today is monday";

    // 1. new
    String s1 = new String("Hello");
    String s2 = new String("Hello");



    //  == , reference not value
    // equals - value
    public static void main(String args[]) {
        StringExample sx = new StringExample();
        int a = 10;
        int b = 10;
        System.out.println(sx.s == sx.s3);
        System.out.println(sx.s.equals(sx.s3));
        System.out.println(a == b);
    }
}
