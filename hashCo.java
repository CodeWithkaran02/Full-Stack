public class hashCo {
    void math() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        hashCo aobj = new hashCo();
        hashCo aobj1 = new hashCo();

        int x = aobj.hashCode();
        int y = aobj1.hashCode();

        System.err.println("aobj hashCode x:" + x);
        System.out.println("aobj hashCode y:" + y);
    }

}
