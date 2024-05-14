package lambda;

public class classAB {
    void show() {
        System.out.println("Implementing Method refrecing");

        InterfaceBA x = new ClassB()::vote_eligibilty;

        // InterfaceBA y = ClassB()::display;

        // InterfaceBA z = ClassB()::new

    }

    public static void main(String[] args) {
        new classAB().show();
    }
}
