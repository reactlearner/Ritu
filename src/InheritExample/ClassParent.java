package InheritExample;

public class ClassParent {

    int a;
    private int n;

    public ClassParent() {
        System.out.println("hello constructor");
    }

    public  ClassParent(int x) {
        System.out.println("value: "+x);
    }

//    public void show() {
//        System.out.println("show method in parent class");
//    }

    public static void main(String args[]) {
        ClassParent cp = new ClassParent();
    }

    public void myMethod() {

    }
}
