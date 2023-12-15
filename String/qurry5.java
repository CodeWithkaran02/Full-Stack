public class qurry5 {
    public String extraEnd(String str) {
        String s = str.substring(str.length() - 2);
        return s + s + s;

    }

    public static void main(String[] args) {
        qurry5 q5obj = new qurry5();
        String result = q5obj.extraEnd("Karan");
        System.out.println(result);
    }
}
