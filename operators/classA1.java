public class classA1 {
    void display() {
        int a = 10;
        for (int k = (a++ + new classA1().meth1(5)) + +(++a + 3) + (++a + 3); k > 10; k++) {
            System.out.println(k + 6);
            break;

        }
    }

    int meth1(int a) {
        return new classA1().meth2(10 + 1, 15 - 3) + (a * 2);

    }

    int meth2(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        classA1 aobj = new classA1();
        aobj.display();
    }
}
