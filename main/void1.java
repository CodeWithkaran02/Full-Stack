
public class void1 {
    int meth1() {
        System.out.println("meth() called");
        return 100;

    }

    public static void main(String args[]) {
        void1 aobj = new void1();
        int x = aobj.meth1();
    }
}
