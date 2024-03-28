import java.util.*;

public class Demo {
    void max(int a, int b) {
        if (a > b)
            System.out.println(a);
        else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.max(40, 50);

    }

}
