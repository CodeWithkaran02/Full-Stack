public class stringequal {
    void meth() {
        String s1 = "Java";
        StringBuffer sb1 = new StringBuffer("Java");
        StringBuilder sbl1 = new StringBuilder("Java");

        String s2 = "Java";
        StringBuffer sb2 = new StringBuffer("Java");
        StringBuilder sbl2 = new StringBuilder("Java");

        System.out.println(s1.equals(s2));
        System.out.println(sb1.equals(sbl2));
        System.out.println(sbl1.equals(sbl2));

        boolean result = sb1.toString().equals(sbl2.toString());
        System.out.println(result);

    }

    public static void main(String[] args) {
        new stringequal().meth();
    }
}
