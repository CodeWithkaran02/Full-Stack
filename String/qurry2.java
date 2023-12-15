public class qurry2 {
    public String makeAbbe(String a, String b) {
        return a.concat(b).concat(b).concat(a);
    }

    public static void main(String[] args) {
        qurry2 q2obj = new qurry2();
        String result = q2obj.makeAbbe("Hi", "Bye");
        System.out.println(result);
    }

}
