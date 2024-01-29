public class classB extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("ClassB :" + i);
        }
    }

}
