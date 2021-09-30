package ExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassA {

    public static void main(String args[]) throws Exception {
        // Exception, Error
        // Throwable - 1. Exception 2. Error
        // Checked, Unchecked
        // try, catch, finally, throw, throws
        int a = 50;
        String s = null;
        throw new Exception();


    }

    public void set() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");

    }
}
