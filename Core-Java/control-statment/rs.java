import java.util.Scanner;

public class rs {
    Scanner sc = new Scanner(System.in);

    void meth(int repeis) {
        System.out.println("How much you need?");
        System.out.println("Enter the unit:");
        int unit = sc.nextInt();
        sc.nextLine();

        int bill = unit * repeis;
        if (bill >= 100) {
            int discount = (bill / 100) * 10;
            System.out.println("your final-bill is :" + (bill - discount));
            System.out.println("conglution your have saved " + discount + " on your final bill");
        } else {
            System.out.println("you final bill is :" + bill);
        }

    }

    public static void main(String[] args) {
        new rs().meth(130);

    }
}