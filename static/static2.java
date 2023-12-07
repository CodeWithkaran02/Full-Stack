public class static2 {

    static int x = meth1();

    static {
        System.out.println("1st static block executed: " + x);
    }

    static int meth1() {
        System.out.println("methiod1 call");
        return 100;

    }

    static int y = meth2();

    static int meth2() {
        System.out.println("meth2()  callrd");
        return 200;
    }

    public static void main(String[] args) {
        System.out.println("main() called");
    }
}
