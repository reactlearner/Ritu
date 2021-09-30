package InheritExample;

public class ClassChild extends ClassParent {

    // polymorphism - compile time, run time
    // 1. Overloading, overriding

    int g;

    public ClassChild() {

    }

    public void add() {
        g = 10;
        a = 13;
        System.out.println(a + g);
    }

    public void show() {
        System.out.println("show method in child class");
    }

    public static void main(String args[]) {
        ClassChild c = new ClassChild();
        c.show();
        String[] arr = {""};
        //c.main(arr, 10);
    }

    public static void main(String args[], int x) {
        System.out.println("hello");
    }
}
