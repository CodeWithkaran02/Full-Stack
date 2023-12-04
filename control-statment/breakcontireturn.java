public class breakcontireturn {
    void meth() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // break;
                // continue;
                return;
            }
            System.out.println("i value is :" + i);
        }
        System.out.println("compiler came  out form the  loop");
    }

    public static void main(String[] args) {
        System.out.println("start");
        new breakcontireturn().meth();
        System.out.println("End");
    }
}
