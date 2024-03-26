public class String1 {
    void meth1() {
        String s1 = "java";
        String s2 = new String("java ");
        char arr[] = { 'j', 'a', 'v', 'a' };
        String s3 = new String(arr);

        String s4 = new String(arr, 1, 2);

        System.out.println("S1 is :" + s1);
        System.out.println("S1 is :" + s2);
        System.out.println("S1 is :" + s3);
        System.out.println("S1 is :" + s4);
        System.out.println("S1 is :" + s1.concat("is awosome"));

    }

    void meth2() {
        String s = "java";
        System.out.println("s is printed:" + s);
        System.out.println(s.concat("is awosome "));

        s = s.concat("is love");
        System.out.println(s);
    }

    public static void main(String[] args) {
        String1 sc = new String1();
        sc.meth1();
        System.out.println("======================");
        sc.meth2();
    }
}
