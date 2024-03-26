public class logical2 {
    public boolean firstlast6(int[] num) {
        if (num[0] == 6 || num[num.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        logical2 l2 = new logical2();
        int[] input = { 6, 1, 2, 3 };
        boolean result = l2.firstlast6(input);
        System.out.println(result);
    }
}
