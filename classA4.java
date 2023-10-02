public class classA4 {
    String meth1(int a, int b) {
        System.out.println(10);
        System.out.println((54 + a) - b);
        int value = new classA4().meth5();
        System.out.println(value);
        return "java";
    }

    int meth2(int a) {
        System.out.println(75);
        int b = 5;
        System.out.println(b - a);
        return (5 * 5) - b;
    }

    void meth3() {
        System.out.println("start");
        System.out.println(new classA4().meth4());
        System.out.println(40);
    }

    String meth4() {
        System.out.println("Today is Saturday");
        return new classA4().meth1(4, 8);

    }

    int meth5() {
        classA4 obj = new classA4();
        return obj.meth2(5);

    }

    public static void main(String[] args) {
        classA4 obj = new classA4();
        obj.meth3();

    }
}