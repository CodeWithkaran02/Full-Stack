
public abstract class classA {
    abstract void meth1();

    void meth2() {
        System.out.println("classA method2() called");
        this.disply();
    }

    static void meth3() {
        System.out.println("classA static called");
    }

    void disply() {
        System.out.println("ClassA method3() called");
    }

    classA() {
        System.out.println("constrator called");
    }

}
