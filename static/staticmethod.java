public class staticmethod {
    int x = 10;
    static int y = 20;

    void meth() {
        System.out.println("method1 calling");
        System.out.println("Instance Variable:" + x);
        System.out.println("static Variable:" + y);
    }

    static void meth1() {
        System.out.println("method2 calling ");
        System.out.println("Instance Variable:" + new staticmethod().x);
        System.out.println("Static variable:" + y);

    }

    public static void main(String[] args) {
        staticmethod aobj = new staticmethod();
        aobj.meth();
        System.out.println("---------------");
        // aobj.meth1();
        // new staticmethod().meth1();
        staticmethod.meth1();
    }
}
