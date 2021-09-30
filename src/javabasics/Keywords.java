package javabasics;

public class Keywords {

    final static int a;

    static {
        a = 10;
        System.out.println("in static block");
    }

    public Keywords() {
        System.out.println("into constructor");
    }

    public static void main(String args[]) {
        System.out.println("in main method");
        Keywords keywords = new Keywords();
    }

    public final void show() {

    }
}
