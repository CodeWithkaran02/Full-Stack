public class constrator1 {
    public constrator1() {
        System.out.println("Sunday");
        constrator1 obj = new constrator1();
        System.out.println("Tuesday");
        String s = obj.display("challenge Accpted");
        System.out.println(s);

    }

    public constrator1(int temp) {
        System.out.println("Saturday");
        // new constertor1(10, 20);
        System.out.println("monday");

    }

    String display(String s) {
        System.out.println("In the text Statement");
        return s;

    }

    public constrator1(int data, int temp) {
        System.out.println("Thuesday");

    }

    public static void main(String args[]) {
        constrator1 obj = new constrator1();
        System.out.println("output verified");
    }
}
