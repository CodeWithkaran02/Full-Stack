public class classB {
    void show() {
        System.out.println("hello ");
    }

    void display() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new classB().show();
        new classB().display();
        System.out.println("----------------------------");
        classB bobj = new classB();
        bobj.show();
        bobj.display();
    }
}
