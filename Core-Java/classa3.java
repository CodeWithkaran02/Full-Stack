public class classa3 {
    void meth1(int a, int b, int c) {
        System.out.println(a);
        System.out.println("a");
        System.out.println(a + b);
        new classa3().meth2();
        System.err.println(c);

    }

    void meth2() {
        System.out.println("method calling");
    }

    public static void main(String[] args) {
        new classa3().meth1(10, 30, 50);

    }
}
