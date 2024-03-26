public class logical {
    int meth3(int[] arr) {
        if (arr.length >= 2)
            return arr[0] + arr[1];
        else if (arr.length == 1)
            return arr[0];
        else
            return 0;

    }

    public static void main(String[] args) {
        logical l = new logical();
        int result = l.meth3(new int[] { 9, 1, 15, 85, 62 });
        System.out.println(result);

    }
}
