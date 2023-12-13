public class logical1 {
    boolean meth1(int[] arr) {
        if (arr[0] != 2 && arr[1] != 2 && arr[0] != 3 && arr[1] != 3) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        logical1 l = new logical1();
        int[] input = { 4, 5 };
        boolean result = l.meth1(input);
        System.out.println(result);
    }
}
