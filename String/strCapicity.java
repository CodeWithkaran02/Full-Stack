public class strCapicity {
    void meth() {
        StringBuffer sb = new StringBuffer();
        System.out.println("capacity :" + sb.capacity());
        sb.append("abcd'efghijklmno");

        System.out.println("======================");
        System.out.println(sb + "sb<===>" + sb.capacity());

        sb.append("q");

        System.out.println(sb + "<==>" + sb.capacity());
        System.out.println("======================");

        System.out.println(sb + "<===>");

        System.out.println("charAt():" + sb.charAt(4));

        System.out.println("StringBuffer:" + sb);

        System.out.println("StringBuffer:" + sb.reverse());
        System.out.println("======================");

        System.out.println("String():" + sb.substring(0, 3));

        sb.setCharAt(0, (char) 5);

        System.out.println("setcharAt():" + sb);
        System.out.println("======================");

        sb.delete(0, 5);

        System.out.println("String buffer:" + sb);

    }

    public static void main(String[] args) {
        new strCapicity().meth();
    }
}
