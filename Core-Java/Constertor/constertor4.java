public class constertor4 {
    int a = 10;

    public String textMethod() {
        new constertor4(100, 200, "java");
        System.out.println(40);
        return new constertor4().textMethod3(new constertor4(50).textMethod2()) +
                new constertor4().textMethod4("hii");

    }

    constertor4() {
        System.out.println("Hi");
    }

    public int textMethod2() {
        System.out.println(50);
        return 10 + 5;

    }

    constertor4(int a) {
        System.out.println("Java is awesome");
    }

    public String textMethod3(int a) {
        System.out.println(18);
        return "is";

    }

    constertor4(int a, int b, String s) {
        System.out.println(a + b);
        System.out.println(s);
    }

    public String textMethod4(String s) {
        System.out.println(88);
        return "good";

    }

    public static void main(String[] args) {
        constertor4 t1 = new constertor4();
        t1.a = 10;
        constertor4 t2 = new constertor4(50);
        t2.a = 80;
        System.out.println("java" + t1.textMethod() + "" + (t1.a + t2.a - 30));

    }
}
