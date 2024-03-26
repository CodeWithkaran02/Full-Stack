public class Datatype {
    int i;
    byte b;
    short s;
    long l;

    float f;
    double d;

    char c;
    boolean flage;

    void math1() {
        System.out.println("int value:" + i);
        System.out.println("byte value:" + b);
        System.out.println("short value:" + s);
        System.out.println("long value:" + l);
        System.out.println("float value:" + f);
        System.out.println("double value:" + d);
        System.out.println("char value:" + c);
        System.out.println("boolean flag:" + flage);

    }

    void math2() {
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println(c);

        byte b1 = 20;
        byte b2 = 30;
        byte b3 = (byte) (b1 + b2);

        System.out.println(b3);

        float f = 83.69f;

        System.out.println(f);

        long l = 458796321456l;

        System.out.println(l);

    }

    public static void main(String[] args) {
        Datatype aobj = new Datatype();
        aobj.math1();
        aobj.math2();
    }

}
