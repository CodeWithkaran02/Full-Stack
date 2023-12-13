public class makepi {
    int[] mathpi1() {
        return new int[] { 3, 1, 4 };

    }

    public static void main(String[] args) {
        makepi mp = new makepi();
        int result[] = mp.mathpi1();

        for (int c : result) {
            System.out.print(c);
        }
    }
}
