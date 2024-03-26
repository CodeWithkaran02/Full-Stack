public class classD {
    void meth1() {
        System.out.println("classD meth1:" + 10);
    }

    void meth2() {
        System.out.println("classD meth2");
    }

    private void meth3(String s) {
        System.out.println("Class D meth3:" + s);
    }

    protected void meth4() {
        System.out.println(" Class A: hi");
    }

    static void meth5() {
        System.out.println("Class D meth5()");

    }

    classD meth6() {
        System.out.println("classD method meth6()");
        return this;
    }

}
