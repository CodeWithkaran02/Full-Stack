
public class classB extends classA {
    void math1() {
        System.out.println("class B is called");
    }

    public static void main(String[] args) {
        classB bobj = new classB();
        bobj.math();
        bobj.math1();
    }
}
