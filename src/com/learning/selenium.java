package com.learning;

import javabasics.Example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class selenium {
    static String[] result;
    static String[] output;




    public static void main(String args[]) {

        String s = "this is \"my dog kutta\" and \"is cute\"";
        output = show(s);
        for(String str : output) {
            if(str.startsWith("\"")) {
                System.out.print(str);
            } else {
                System.out.println(str);
            }
        }


    }

    public static String[] show(String s) {
        String arr[]  = s.split(" ");
        result = arr;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].startsWith("\"")) {
                //System.out.print(arr[i]+" ");
                result[i] = arr[i]+" ";
            }
            else {
                result[i] = arr[i];
            }

        }
        return result;
    }
}
