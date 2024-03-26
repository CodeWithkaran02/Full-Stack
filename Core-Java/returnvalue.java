public class returnvalue {

    void meth1() {
        System.out.println(10);
        System.out.println(20);
        System.out.println(30);
        return;
    }

    int math2() {
        System.out.println("mathod2() called");
        return 99;

    }

    int meth3() {
        System.out.println("method3() called");

        int a = 2;
        if (a < 5) {
            System.out.println("if block exeuted");
            return 100;
        } else {
            System.out.println("else block exeuted");
            return 200;

        }
    }

    public static void main(String args[]) {
        System.out.println("Start");
        returnvalue aobj = new returnvalue();

        aobj.meth1();
        System.out.println("-------------------");

        int x = aobj.math2();
        System.out.println("method2() is returning" + x);

        System.out.println("-------------------");

        int y = aobj.meth3();

        System.out.println("method3() is returning " + y);
        System.out.println("end");

    }

}
