public class qurry4 {
    public void meth(String word) {
        String revString = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            revString += word.charAt(i);
        }
        if (word.equals(revString)) {
            System.out.println(word + " is Palidrom");
        } else {
            System.out.println(word + " is not Palidrom");
        }

    }

    public static void main(String[] args) {
        qurry4 q4obj = new qurry4();
        q4obj.meth("MadaM");
    }
}
