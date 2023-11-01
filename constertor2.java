public class constertor2 {

    void meth1() {
        System.out.println("mathod called");
    }

    private constertor2() {
        System.out.println("defalt construtor");
        return;
    }

    private constertor2(String s) {
        System.out.println("Paramitrize Construtor:" + s);
    }

    public static void main(String[] args) {
        constertor2 aobj = new constertor2("java");
        aobj.meth1();
    }
}
