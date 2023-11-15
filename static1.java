public class static1 {

    static int x = 10;
    static int y = 20;
    static {

        System.out.println("---test1 sb1 called ----");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }

    static void ml() {
        int x = 100;

        System.out.println("static method called");
        System.out.println("x:" + x);
        System.out.println("y:" + y);

    }

    public static void main(String[] args) {
        ml();
    }

    static {
        System.out.println("test2 sb2 called ");
        System.out.println("x:" + x);
        System.out.println("y: " + y);
    }
}
