public class consgrater {
    consgrater(int a, int b) {
        if (a > b) {
            System.out.println(a + ": is grater");
        } else {
            System.out.println(b + ":B is gratter");
        }

    }

    public static void main(String[] args) {
        consgrater aobj = new consgrater(15, 35);
    }
}
