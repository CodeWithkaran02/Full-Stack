public class hashCo {
    void math() {
        System.out.println("Hello");
    }

    void math1() {
        System.out.println("Java is awosame ");
    }

    protected void finalize() {
        System.out.println("Grabage has been collected");

    }

    public static void main(String[] args) {
        hashCo aobj = new hashCo();
        hashCo aobj1 = new hashCo();

        int x = aobj.hashCode();
        int y = aobj1.hashCode();

        System.out.println("aobj hashCode x:" + x);
        System.out.println("aobj1 hashCode y:" + y);

        System.out.println("=========================");
        boolean result1 = (aobj).equals(aobj1);
        System.out.println("result1:" + result1);

        boolean result2 = (aobj).equals(aobj);
        System.out.println("result2:" + result2);

        System.out.println("=========================");
        System.out.println(aobj.getClass());

        System.out.println("======================");
        System.err.println("aobj:" + aobj.toString());
        System.err.println("aobj1:" + aobj1.toString());

        System.gc();

    }

}
