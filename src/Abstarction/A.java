package Abstarction;

public interface A {

    int a = 5;

    public void first();

    public default void fourth() {
       System.out.println("hi");
   }

}
