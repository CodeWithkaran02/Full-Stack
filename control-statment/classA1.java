public class classA1 {
    void meth1(int a) {
        System.out.println("-------------mathod1----------");
        if (a < 10) {
            System.out.println("a value :" + a);
        }
        System.out.println("method()1 exeuted");
    }

    void meth2(int a) {
        System.out.println("-------------mathod2----------");
        if (a <= 5) {
            System.out.println("hi");
            System.out.println("hello");
        }

        System.out.println("method()2 exeuted");
    }

    // void meth3(int a) {
    // System.out.println("-------------mathod3----------");
    // if (!(a <= 'A'))
    // return 100;
    // return 200;

    // }
    // System.out.println("method()3 exeuted");

    void meth4(int a) {
        System.out.println("-------------mathod4----------");
        if (a <= 5) {
            System.out.println("if block exeuted:" + (++a));
        }
        if (a == 6) {
            new classA1().meth5();
        }
        System.out.println("compiler caome out from the inner if block");
        System.out.println("meth6() executed");
    }

    void meth5() {
        System.out.println("-------------mathod5----------");
        System.out.println("java is awosome");
    }

    void meth6(int a) {
        System.out.println("-------------mathod6----------");
        if (a <= 3) {
            System.out.println("hii");

        }
        System.out.println("meth6() executed");
    }

    void meth7(int a) {
        System.out.println("-------------mathod7----------");
        if (false) {
            System.out.println("hii");

        } else {
            System.out.println("hello");
        }

        System.out.println("meth7() executed");
    }

    void meth8(int a) {
        System.out.println("-------------mathod8----------");
        if (a > 0) {
            System.out.println(a + " is positive number ");
        } else if (a < 0) {
            System.out.println(a + "is nagetive number");
        } else {
            System.out.println(a + "equl number");
        }
        System.out.println("meth8() executed");
    }

    public static void main(String[] args) {
        classA1 aobj = new classA1();
        aobj.meth1(1);
        aobj.meth2(10);
        // System.out.println(aobj.meth3('A'));
        aobj.meth4('A' - 60);
        aobj.meth6(5);
        aobj.meth7(15);
        aobj.meth1(0);

    }
}
