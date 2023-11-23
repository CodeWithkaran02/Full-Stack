public class methint {
    static int x = ml();

    static {
        System.out.println(x);
        methint.x = x + 20;

    }

    static int ml() {
        methint.x = 50;
        return m2();

    }

    static int m2() {
        System.out.println(methint.x);
        return 100;
    }

    public static void main(String args[]) {
        System.out.println(methint.x);
    }
}
