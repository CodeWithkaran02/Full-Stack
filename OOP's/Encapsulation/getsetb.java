import java.util.Scanner;
import pack.getset;

public class getsetb {
    void meth() {
        Scanner sc = new Scanner(System.in);
        getset gs = new getset();

        System.out.println("Please Enter your name:");
        gs.setstuName(sc.nextLine());

        System.out.println("Please Enter your RollNumber");
        gs.setstuRollno(sc.nextInt());

        System.out.println("==================");

        System.out.println("Accessing the variable which are present in getset");

        System.out.println("Student Name:" + gs.getstuName);

        System.out.println("Student Name:" + gs.getstuRollno);
    }

}
