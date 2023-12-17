public class Strbulbff {
    void meth() {
        String s1 = "Java";
        StringBuffer buffer1 = new StringBuffer("Java");
        StringBuilder builder1 = new StringBuilder("Java");

        System.out.println("----------------------");
        System.out.println(s1);
        System.out.println(buffer1);
        System.out.println(builder1);

        s1.concat("is awesome");
        buffer1.append("is awesome");
        builder1.append("is awesome");

        System.out.println("----------------------");

        System.out.println(s1);
        System.out.println(buffer1);
        System.out.println(builder1);

    }

    public static void main(String[] args) {
        new Strbulbff().meth();
    }
}
