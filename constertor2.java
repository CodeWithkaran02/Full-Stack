public class constertor2 {

    void meth1() {
        System.out.println("mathod called");
    }

    constertor2() {
        System.out.println("defalt construtor");
    }

    constertor2(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        constertor2 aobj = new constertor2("java");
        aobj.meth1();
    }
}
