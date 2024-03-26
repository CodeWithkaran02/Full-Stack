public class thiskeyword4 {
    thiskeyword4() {
        this(500);

        // this.meth();
        System.out.println("default Construtor");
    }

    thiskeyword4(int a) {
        this("java is Aersome");

    }

    thiskeyword4(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        new thiskeyword4();
    }
}
