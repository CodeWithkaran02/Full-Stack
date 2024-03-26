
public class classB extends classA {
    void meth1() {
        System.out.println("Abstact method overridden ");
    }

    public static void main(String[] args) {
        classA aobj = new classB();
        aobj.meth1();
        aobj.meth2();
    }

}
