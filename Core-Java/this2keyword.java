public class this2keyword {
    void meth() {
        System.out.println("method1() called ");
        this.meth2();

    }

    void meth2() {
        System.out.println("method2 () called");
    }

    void meth3() {
        System.out.println("method 3() called");
    }

    public static void main(String[] args) {
        new this2keyword().meth();
        // this.meth1(); C.E
    }
}
