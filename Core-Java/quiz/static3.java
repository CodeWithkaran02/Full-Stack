public class static3 {
    int x = 10;

    public static void main(String[] args) {
        System.out.println(new static3().x);
    }

    static {
        int x = 30;
        System.out.println(x + " ");
    }

}
