public class this1keyword {

    int a = 10;
    static int b = 20;

    void meth1() {
        int a = 30;
        System.out.println("Instance Variable:" + this.a);
        System.out.println("Static Variable: " + this.b);
        System.out.println("Local Variable: " + this.a);
    }

    public static void main(String[] args) {
        new this1keyword().meth1();
    }
}
