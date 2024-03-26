public class classA9 {
    int c;
    static int e;

    classA9() {
        System.out.println(++c);
        System.out.println(++e);

    }

    public static void main(String[] args) {
        int a = 34;
        int b = 21;
        new classA9().c -= a++ + ++b;
        int d = --a + --b + new classA9().c--;
        int e = a + +b + +new classA9().c + d--;
        int f = -a + b-- + b - new classA9().c + -d++;
        int sum = a + b + new classA9().c + d + e + f;
        System.out.println("Sum:" + sum);
    }

}
