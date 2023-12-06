import java.util.*;

public class id {
    Scanner sc = new Scanner(System.in);

    void meth() {

        System.out.println("Enter you name :");
        String empname = sc.nextLine();

        System.out.println("Your name is:" + empname);

        System.out.println("Enter your empID");
        int id = sc.nextInt();
        System.out.println("your empId is:" + id);

        System.out.println("Enter your Department:");
        String dept = sc.next();
        System.out.println("Enter the department:" + dept);

        System.out.println("Enter the Addres:");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("Your Address is:" + address);

        System.out.println("Name: " + empname + "EmpId: " + id + "Department: " + dept + "Address" + address);

    }

    public static void main(String[] args) {
        new id().meth();

    }
}
