public class ClassA {
    void meth() {
        int arr[];
        arr = new int[5];

        int arr2[] = new int[4];
        int arr3[] = { 100, 200, 300, 400, 500, 600 };
        int arr4[] = new int[] { 11, 22, 33, 44, 55 };
        String s1 = "java";

        System.out.println("Arr1 length:" + arr.length);
        System.out.println("Arr2 length:" + arr2.length);
        System.out.println("Arr3 length:" + arr3.length);
        System.out.println("Arr4 length:" + arr4.length);

        System.out.println(s1);

        System.out.println(arr3[4]);

        System.out.println(arr3[arr2.length - arr2.length]);

        System.out.println(arr3[arr4.length - 1]);

    }

    public static void main(String args[]) {
        new ClassA().meth();
    }
}
