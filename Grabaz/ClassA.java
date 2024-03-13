
public class ClassA {

    void meth1() {
        System.out.println("Method called");
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage has been collected");
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        ClassA aobj1 = new ClassA();

        aobj.meth1();
        System.gc();
    }
}
