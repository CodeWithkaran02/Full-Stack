import java.util.Scanner;

public class ClassB {
    void meth1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Student name you want to enter:");

        String studentName[] = new String[sc.nextInt()];
        System.out.println("User want to enter " + studentName.length + "name");

        System.out.println("Please enter " + studentName.length + "name");

        System.out.println("===========for loop =================");
        for (int i = 0; i <= studentName.length - 1; i++) {
            studentName[i] = sc.next();
        }
        System.out.println("Data ented");
        System.out.println("===========for loop =================");
        for (int i = 0; i <= studentName.length - 1; i++) {
            System.out.println(studentName[i]);

        }
        System.out.println("===========for loop =================");
        for (int i = studentName.length - 1; i >= 0; i--) {
            System.out.println(studentName[i]);
        }
        System.out.println("===========for each=================");

        for (String data : studentName) {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        new ClassB().meth1();

    }
}
