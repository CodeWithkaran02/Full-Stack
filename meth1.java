public class meth1 {
    void mth1() {
        meth1 aobj1 = new meth1();
        aobj1.meth4();
        int a = 10;
        System.out.println(10);
        System.out.println(54 + a);

    }

    void meth2() {

        int a = 20;
        System.out.println(78 - a);
    }

    void meth3() {
        int a = 30;
        meth1 aobj2 = new meth1();
        aobj2.meth3();

        System.out.println(89 + 1);
        System.out.println(10);

    }

    void meth4() {
        int a = 30;
        meth1 aobj3 = new meth1();
        aobj3.meth2();
        System.out.println(89);
        System.out.println(85);
        System.out.println(44);
    }

    void meth() {

        System.out.println(77);
        meth1 aobj4 = new meth1();
        aobj4.meth3();
        System.out.println(99);
    }

    public static void main(String args[]) {
        System.out.println("Start");
        meth1 aobj = new meth1();
        aobj.mth1();
        System.out.println("End");

    }
}
