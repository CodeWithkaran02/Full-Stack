public class ClassC extends ClassB {
    void meth1(int a, int b) {
        System.out.println("Class C method");
        System.out.println("Subtation:" + (a - b));

    }

    public static void main(String[] args) {
        ClassB bobj = new ClassC();
        bobj.meth1(50, 40);
        System.out.println("=====================");
        ClassB bobj2 = new ClassB();
        bobj2.meth1(50, 40);
    }
}
