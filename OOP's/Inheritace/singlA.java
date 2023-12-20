public class singlA extends singl {
    void meth1() {
        System.out.println("method class Ai");
    }

    public static void main(String[] args) {
        singl sl = new singlA();
        sl.meth();
        sl.meth1();

        singlA sa = new singlA();
        sa.meth1();
        sa.meth();

    }
}
