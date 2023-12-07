public class static4 {
    int x = 10;

    public static void main(String[] args) {
        static4 s1 = new static4();
        static4 s2 = new static4();
        s2.x = 20;
        System.out.println(new static4().x + " ");
        System.out.println(s2.x);

    }

}
