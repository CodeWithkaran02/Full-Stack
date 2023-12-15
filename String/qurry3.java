public class qurry3 {
    public String makeOutWorld(String out, String word) {
        // return out.concat(word).concat(">>");
        // return "<<" + word + ">>";
        return out.substring(0, 2) + word + out.substring(2);
    }

    public static void main(String[] args) {
        qurry3 q3obj = new qurry3();
        String result = q3obj.makeOutWorld("<<>>", "Yay");
        System.out.println(result);

    }
}
