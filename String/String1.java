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

        s1 = s1.concat("is love");
        System.out.println(s1);

    }

    public static void main(String[] args) {
        String1 sc = new String1();
        sc.meth1();
    }
}
