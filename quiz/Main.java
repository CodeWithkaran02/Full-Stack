public class Main {

    int x = 10;

    public static void main(String[] args) {
        Main obj = new Main();
        obj.x = 50;
        System.out.println(obj.x); // 50
        obj = null; // here garbage collector will destroy the Demo object
        System.out.println(obj.x); // NullPointerException
    }
}
