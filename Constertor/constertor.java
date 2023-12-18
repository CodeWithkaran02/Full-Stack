public class constertor {

    constertor() {
        System.out.println("Non- paramitrize constertor");
    }

    constertor(int a) {
        System.out.println(" paramitrize constertor");
    }

    void meth1() {
        System.out.println("method1 is calling ");
    }

    void meth2(int b) {
        System.out.println("method2 is calling:" + b);
    }

    public static void main(String[] args) {
        new constertor().meth1();
        new constertor().meth2(500);

    }
}
