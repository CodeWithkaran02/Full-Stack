public class ClassA5 {
    static int i = 10;

    public static void fun1() {
        System.out.println("inside fun1 of Demo");
    }

    public static void main(String[] args) {
        // using directly
        System.out.println(i);
        fun1();

        System.out.println(ClassA5.i);
        ClassA5.fun1();
        // using by an object
        ClassA5 obj = new ClassA5();
        System.out.println(obj.i);
        obj.fun1();
    }
}
