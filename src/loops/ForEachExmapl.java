package loops;

import Abstarction.AbstractExample;

public class ForEachExmapl {

    public static void main(String args[]) {

        // array
        // datatype array name = declare/initialize
        int a = 10;

        // 1 - new keyword
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 13;
        arr[3] = 19;
        arr[4] = 22;
        int b = 23;

        // 2 - array literal
        int[] arr2 = {3, 41, 32, 23};

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 41) {
                System.out.println("element found");
                break;
            }
            System.out.println("in loop");
        }
    }
}
