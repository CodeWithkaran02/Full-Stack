public class iterationwhile {
    void meth1(int a) {
        System.out.println("-----------meth1()--------");
        while (a <= 5) {
            System.out.println("a value is: " + a);
            a++;

        }
        System.out.println(" methiod1 execution completed");
    }

    void meth2(int a) {
        System.out.println("-----------meth2()--------");
        while (a <= 3)
            System.out.println("a value is: " + a);
        a++;
        System.out.println(" methiod2 execution completed");
    }

    void meth3(int a) {
        System.out.println("------------meth3()----------");
        while (true) {
            System.out.println("a value is: " + a);
            a++;

        }
        // System.out.println(" methiod3 execution completed");
    }

    void meth4(int a) {
        System.out.println("------------math4()-----------");
        do {
            System.out.println(" a  value is : " + a);
            a++;

        } while (a <= 5);
        System.out.println(" methiod4 execution completed");
    }

    public static void main(String[] args) {
        iterationwhile aobj = new iterationwhile();
        aobj.meth1(1);
        // aobj.meth2(1); // infinite
        // aobj.meth3(1); // infinite
        aobj.meth4(10);
    }
}
