public class ClassA {
    void meth1() {
        int a = 10;
        System.out.println(a++);
        a++;
        System.out.println(a++);
        System.out.println(--a);
        a++;
        ++a;
        System.out.println(a++);
        System.out.println(a--);

        System.out.println(--a);
        a++;

        System.out.println(--a);
        --a;

        System.out.println(a++);
        System.out.println(a);

    }

    public static void main(String[] args) {
        new ClassA().meth1();
    }
}
