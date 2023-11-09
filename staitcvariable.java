public class staitcvariable {
    int a;
    static int b;

    staitcvariable() {
        a++;
        b++;
        System.out.println("Instance Variable: " + a);
        System.out.println("Static variable:" + b);
        // System.out.println("static variable:" + new staitcvariable().b);
        System.out.println("static variable:" + staitcvariable.b);
    }

    public static void main(String[] args) {
        new staitcvariable();
        System.out.println("------------");
        new staitcvariable();
        System.out.println("----------------");
        new staitcvariable();

    }
}
