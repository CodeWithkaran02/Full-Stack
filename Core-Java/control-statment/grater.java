public class grater {
    void math(int a, int b, int c) {
        if (a > b) {

            if (a > c)
                System.out.println(a + " A is boggest number ");
            else
                System.out.println(c + " C is boggest number ");

        } else {

            if (b > c)
                System.out.println(b + " B is boggest number ");
            else
                System.out.println(c + " C is boggest number ");

        }

    }

    public static void main(String[] args) {
        new grater().math(4500, 550, 305);
    }
}