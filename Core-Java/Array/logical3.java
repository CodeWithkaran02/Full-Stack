public class logical3 {
    public boolean meth(int[] arr) {
        if (arr.length >= 1 && arr[0] == arr[arr.length - 1])
            return true;
        return false;
    }

    public static void main(String[] args) {
        logical3 l3 = new logical3();
        boolean result = l3.meth(new int[] { 1, 2, 3, 1 });
        System.out.println(result);
    }
}
