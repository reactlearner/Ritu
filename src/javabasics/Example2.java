package javabasics;

import java.util.Scanner;

public class Example2 extends Keywords{
    int loginID;
    int a;
    String s;

    // constructor
    private Example2() {
        System.out.println("hello constructor");
    }



    public  static void main(String args[]) {
        Example2 ex = new Example2();
        ex.show();
        System.out.println("value 1: "+ex.a);
        System.out.println("value 1: "+ex.s);
    }

}
