public class Variable {

    int a = 10;
    static int b = 20;
    int c = 30;
    static boolean y;
    int x;

    void meth1() {

        int c = 30;
        int a = 100;
        int b = 3000;

        System.out.println("Inistace the value a" + new Variable().a);
        System.out.println("local Variable a:" + a);

        System.out.println("------------------------------");

        System.out.println("static variable:" + new Variable().b);
        System.out.println("local variable :" + b);

        System.out.println("-------------------");

        System.out.println("static variable y:" + y);

        System.out.println("---------------");

        System.out.println("local variable c:" + new Variable().c);
        System.out.println("local variable a:" + a);
        System.out.println("local variable b:" + b);

    }

    void meth2() {
        System.out.println("Instance Variable:" + x);
        System.out.println("static variable" + y);
        System.out.println("local variable :" + c);

    }

    public static void main(String[] args) {
        new Variable().meth1();

    }
}