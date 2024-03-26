public class classA8 {

    void display() {
        int i = 100;
        Integer ibal1 = Integer.valueOf(i);
        System.out.println("int PDT value" + ibal1);
        System.out.println("int WCO value" + ibal1);

        byte b = 50;
        Byte bval = Byte.valueOf(b);
        System.out.println("int PDT value" + bval);
        System.out.println("int WCO value" + bval);

        Integer ibal2 = Integer.valueOf(500);
        Byte bval2 = Byte.valueOf((byte) 200);

        System.out.println("int PDT value" + ibal2);
        System.out.println("int WCO value" + bval2);

    }

    public static void main(String[] args) {

    }
}