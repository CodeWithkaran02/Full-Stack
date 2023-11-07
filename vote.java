import java.util.Scanner;

public class vote {

    void meth(int a) {
        if (a <= 18) {
            System.out.println("you are not  eligibal for vote:" + a);
        } else if (a >= 19) {
            System.out.println("you are  eligibal for vote:" + a);
        }

    }

    public static void main(String args[]) {
        new vote().meth(16);

    }
}
