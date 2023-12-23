public class super2 extends super1 {
    void meth2() {
        System.out.println("method2 called from classb");
    }

    super2() {
        System.out.println("super2 defalt condtructor from classb");
    }

    super2(int a) {
        super("is awesome");
        System.out.println("classb parametezid constructor");
    }

    public static void main(String[] args) {
        new super2(100).meth2();
    }
}
