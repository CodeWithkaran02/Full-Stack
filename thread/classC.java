public class classC {
    public static void main(String[] args) throws InterruptedException {
        classB bobj = new classB();
        bobj.start();
        bobj.join();
        for (int i = 1; i <= 5; i++) {
            System.out.println("ClassC :" + i);
        }
    }
}
