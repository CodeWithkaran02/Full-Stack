public class this3keyword {
        this3keyword meth1() {
                System.out.println("Method callled");
                return this;
        }

        this3keyword meth2() {
                System.out.println("Method 2()  called");
                return this;
        }

        int meth3() {
                System.out.println("MEthod3() called");
                return 100;

        }

        public static void main(String[] args) {
                System.out.println(new this3keyword().meth1().meth2().meth3() - 99);
        }
}
