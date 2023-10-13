
public class static1 {

    public void math1() {
        System.out.println("method1 is calling");
    }

    public static void math2() {
        System.out.println("method2 is calling ");
    }

    public static void main(String[] args) {
        mathd aobj = new mathd();
        aobj.math1();
        mathd.math2();
    }
}
