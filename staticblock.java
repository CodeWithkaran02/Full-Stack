public class staticblock {
    final static int x;

    static {
        x = 10;
        System.out.println("static 1st call");
    }

    public static void main(String[] args) {
        System.out.println("main() calling ");
    }

    static {
        // x=100; C.E final variable are constant
        System.out.println("static 2nd call ");
    }
}
