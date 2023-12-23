public class super1 {
    void meth() {
        System.out.println("meth called from super1");
    }

    super1() {
        System.out.println("defalt constructor super1");
    }

    super1(String s) {
        this();
        System.out.println("java" + s);

    }
}
