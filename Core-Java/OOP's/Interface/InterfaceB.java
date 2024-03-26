//package OOP's.Interface;

public interface InterfaceB {

    void show();

    default void msg() {
        System.out.println("i am from InterfaceB");
    }
}
