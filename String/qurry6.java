public class qurry6 {
    public String firstTwo(String word) {

        if (word.length() >= 2)
            return word.substring(0, 2);
        return word;

    }

    public static void main(String[] args) {
        qurry6 q6obj = new qurry6();

        String result = q6obj.firstTwo("java");
        System.out.println(result);
    }
}