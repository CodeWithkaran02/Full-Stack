public class table {
    void math1(int a) {
        for (int i = 1; i <= 10; i++) {

            int b = a * i;
            System.out.println(a + " *  " + i + " = " + b);
        }

    }

    public static void main(String[] args) {
        new table().math1(2);
    }
}
