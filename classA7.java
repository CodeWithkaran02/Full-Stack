public class classA7 {
    static int a = 0;
    int b = 0;

    classA7() {
        a++;
        b++;
        System.out.println("Static Variable ===>" + a);
        System.out.println("Intance Variable ===>" + b);
        System.err.println("----------------");
    }

    void display() {
        System.out.println("****Accessing static Variable***");
        System.out.println(classA7.a);
        System.out.println(a);
        System.out.println(new classA7().a);
    }

    public static void main(String[] args) {
        new classA7();
        new classA7();
        new classA7();
        System.out.println("###################");
        new classA7().display();
    }
}
