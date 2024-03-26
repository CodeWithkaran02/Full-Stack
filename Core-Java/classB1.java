
public class classB1 {
    void meth1(int a, int b) {
        classB1 bobj = new classB1();
        System.out.println(a - 1);
        System.out.println(b);
        bobj.meth4(10, 20, 30);
    }

    void meth2(int x) {
        classB1 bobj = new classB1();
        System.out.println(x);
        bobj.meth1(10, 10);
        System.out.println(x + 9);
    }

    void meth3(int x, int y) {
        System.out.println(x * y);
        classB1 bobj = new classB1();
        System.out.println(y);
        bobj.meth2(1);

    }

    void meth4(int a, int b, int c) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * c);
        System.out.println(a / b);

    }

    public static void main(String args[]) {
        classB1 bobj = new classB1();
        bobj.meth3(5, 2);
    }
}
