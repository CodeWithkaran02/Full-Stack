//import java.lang.*;

public class classA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runbale thread :" + i);
        }

    }

    public static void main(String[] args) {
        classA aobj = new classA();
        Thread t = new Thread(aobj);
        t.start();

    }
}
