public class classA {
    public void sum() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition " + c);

    }

    public void sub() {
        int a = 100;
        int b = 99;
        int c = a - b;
        System.out.println("subtraction" + c);
    }

    public static void main(String args[]) {
        System.out.println("Start ");
        classA sobj = new classA();
        sobj.sum();
        sobj.sub();
        System.out.println("Welcome to Java");
    }
}