public class classE extends classD {
    void meth1() {
        System.out.println("classE meth1:" + 10);
    }

    void meth2() {
        System.out.println("classE meth2");
    }

    private void meth3(String s) {
        System.out.println("Class E meth3:" + s);
    }

    // void meth4() {
    // System.out.println(" Class D: hi");
    // }

    static void meth5() {
        System.out.println("Class E meth5()");

    }

    classD meth6() {
        System.out.println("classE method meth6()");
        return this;
    }

    public static void main(String[] args) {
        classD dobj = new classD();
        dobj.meth1();
        dobj.meth2();
        dobj.meth4();
        dobj.meth5();
        dobj.meth6();

    }
}
