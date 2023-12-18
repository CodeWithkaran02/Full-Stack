public class stringallmeth {
    void meth1() {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = new String("Java");

        System.out.println("------------equal()----------------");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals("Java"));
        System.out.println(s1.equals("Java"));

        System.out.println(s1.equalsIgnoreCase("Java"));
        System.out.println("--------==-----------");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s4);
        System.out.println(s1 == "Java");
        System.out.println(s1 == new String("Java"));

        System.out.println("----------------------------------------");

        System.out.println("length():" + s1.length());
        System.out.println("length():" + s1.concat("is awesome").length());
        System.out.println("length():" + "Java is awesome".length());
        System.out.println("s1:" + s1);
        System.out.println("--------------------------------------------");

        s1 = "Java";
        // System.out.println("CharAt():" + s1.charAt(4));
        System.out.println("charAt():" + s1.charAt("Java is awesome".length() / 3 - 2));
        // System.out.println("charAt():" + s1.charAt(new stringallmeth().meth2()));

        System.out.println("startsWith():" + s1.startsWith(s2));
        System.out.println("startsWith():" + "Java ".startsWith(" ".concat(s2)));

        System.out.println("toLowerCase() :" + "Java" + s1.toLowerCase());

        System.out.println("s1 :" + s1);

        System.out.println(s1.toLowerCase().equalsIgnoreCase(s4));

        System.out.println("toUppercase():" + s1.toUpperCase());

        System.out.println("============subString=================");
        String s5 = "I love India";
        System.out.println("subString():" + s5.split(7));

        char arr[] = { 'J', 'a', 'v', 'a' };
        System.out.println("substring():" + s5.substring(arr.length - 2, 6));
        System.out.println("subString():" + s5.substring(4, 9));

        System.out.println("replace():" + s1.replace('a', 'A'));
        System.out.println("s1:" + s1);

        String s6 = "Hello world";
        System.out.println(s6.length());
        System.out.println(s6.trim().length());

        System.out.println("indexof():" + s6.indexOf('o'));

        System.out.println("lastIndexof():" + s6.lastIndexOf('o'));

        String s7 = "Java is awesome";
        System.out.println("-------------------------");
        byte arr2[] = s7.getBytes();

        for (byte x : arr2) {
            System.out.println((char) x);

        }

    }

    int meth2() {
        System.out.println("meth2() called");
        return 0;
    }

    public static void main(String[] args) {
        new stringallmeth().meth1();
    }
}
