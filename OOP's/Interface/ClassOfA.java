//package OOP's.Interface;

public class ClassOfA extends ClassOfB implements InterfaceA, InterfaceB {
    public void meth1() {
        System.out.println("interface B abstract method overiddin");
    }

    public void show() {
        System.out.println("InterfaceB abstract method overridin");
    }

    public void msg() {
        InterfaceA.super.msg();
        InterfaceB.super.msg();

    }

    public static void main(String[] args) {
        InterfaceA aobj = new ClassOfA();
        aobj.meth1();
        aobj.meth2();
        Interfaceb bobj = new ClassOfA();

        System.out.println("====================");

        new ClassOfA().msg();
        System.out.println("====================");
        new ClassOfA().disply();

    }
}
