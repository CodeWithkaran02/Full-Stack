//package OOP's.Interface;

public interface InterfaceA {

    void meth1();

    default void meth2() {
        System.out.println("Default method of interface A");
        this.meth4();
    }

    static void meth3() {
        System.out.println("static method of InterfaceA");
    }

    default void msg() {
        System.out.println(" i am from Interface A");
    }

    private void meth4() {
        System.out.println("private method");
    }

    public static void main(String[] args) {
        System.out.println("main() of interfaceA");
        InterfaceA.meth3();
    }

}
