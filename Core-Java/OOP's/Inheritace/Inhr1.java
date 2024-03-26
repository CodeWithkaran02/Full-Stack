public class Inhr1 {
    void meth() {
        System.out.println(10);
        System.out.println(this.meth2() + 56);
    }

    void meth2() {
        System.out.println(75);
        System.out.println(96);
        return this.meth3();
    }

    int meth3() {
        System.out.println(74);
        System.out.println(92);
        return 74 - 92;

    }

    voi meth4() {
        System.out.println(56);
    }

    Inhr1() {
        this(52);
        this.meth1();
        System.out.println(85);
    }

    Inhr1(int a) {
        System.out.println(a + 7);
    }
}
