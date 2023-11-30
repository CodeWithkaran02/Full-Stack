public class parsecent {
    void meth(int unit) {
        int bill = unit * 100;
        if (bill >= 100) {
            int discount = (bill / 100) * 10;
            System.out.println("your final-bill is :" + (bill - discount));
            System.out.println("conglution your have saved " + discount + " on your final bill");
        } else {
            System.out.println("you final bill is :" + bill);
        }

    }

    public static void main(String[] args) {
        new parsecent().meth(13);

    }
}
