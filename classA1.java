public class classA1 {
    void meth(int a, int b) {
        System.out.println("Calling method:");
        System.out.println(a);
        System.out.println(b);
    }

    void meth2(int a, String s) {
        System.out.println("Calling method:");
        System.out.println(a);
        System.out.println(s);

    }

    public static void main(String args[]) {
        classA1 obj = new classA1();
        obj.meth(10, 30);
        obj.meth2(20, "hello java");
    }
}
