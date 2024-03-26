public class switchopration {

    void math(char opration, int a, int b) {

        switch (opration)

        {
            case '+':
                System.out.println("Addition " + (a + b));
                break;
            case '-':
                System.out.println("Subtration " + (a - b));
                break;
            case '*':
                System.out.println("Multiplation " + (a * b));
                break;
            case '/':
                System.out.println("Divition " + (a / b));
                break;

            default:
                break;
        }
    }

    public static void main(String[] args) {
        new switchopration().math('*', 10, 20);

    }

}
