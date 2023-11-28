public class classA {
    void method1() {
        Integer ival1 = new Integer(100);
        Integer ival2 = new Integer(200);
        Integer ival3 = new Integer(300);

        int i1 = ival1.intValue();
        int i2 = ival2.intValue();
        int i3 = ival3.intValue();

        System.out.println("Interger WCO:" + ival1);
        System.out.println("Interger WCO:" + ival2);
        System.out.println("Interger WCO:" + ival3);

        System.out.println("-----------------------------");

        System.out.println("Interger PDT:" + i1);
        System.out.println("Interger PDT:" + i2);
        System.out.println("Interger PDT:" + i3);

        System.out.println("-----------------------------");

        Byte bval = new Byte((byte) 50);
        byte b = bval.byteValue();
        System.out.println("Byte WCO:" + bval);
        System.out.println("byte PDT:" + b);

        System.out.println("-----------------------------");

        Character cval = new Character('A');
        char c = cval.charValue();
        System.out.println("Charater WCO:" + cval);
        System.out.println(" char PDT :" + c);

        System.out.println("-----------------------------");

        Boolean fval = new Boolean("java");
        boolean b = fval.booleanValue();
        System.out.println("Boolean WCO:" + fval);
        System.out.println(" booll PDT :" + b);

    }

    public static void main(String[] args) {
        new classA().method1();
    }
}
