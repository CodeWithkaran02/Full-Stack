public class ClassA {
    private void meth1() {
        System.out.println(10);

    }

    static final void meth1(int a) {
        System.out.println(20);

    }

    protected void meth1(int a, String s) {
        System.out.println(30);

    }

    public void meth1(String s) {
        System.out.println(40);

    }

    void meth1(byte b) {
        System.out.println(50);

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
        aobj.meth1(100);
        aobj.meth1(01, "java");
        aobj.meth1("java");
        aobj.meth1((byte) 200);
        System.out.println("========================");
        main("java is awesome");
        main(500);
    }

    public static void main(String s) {

        System.out.println("1 st print");
    }

    public static void main(int a) {
        System.out.println("2nd print");
    }
}
