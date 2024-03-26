public class commam {
    public boolean commanEnd(int a[], int b[]) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
            return true;
        return false;

    }

    public static void main(String[] args) {
        commam c = new commam();
        int[] input1 = { 1, 2, 3 };
        int[] input2 = { 14, 5, 3 };
        boolean result = c.commanEnd(input1, input2);
        System.out.println(result);
    }
}
