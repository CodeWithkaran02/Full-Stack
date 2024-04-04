import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Queue1 {

    void meth1() {
        System.out.println("Implementing the Queue");
        List<Object> ll1 = new LinkedList<Object>();

        LinkedList<Object> ll2 = new LinkedList<Object>();

        // add() list Interface
        // offer() -- Queue Inteface

        ll1.add(10);

        ll2.add(100);
        // ll2.add("java");
        // ll2.add(null);
        ll2.add(200);
        ll2.add(300);
        ll2.add(400);
        ll2.add(500);
        ll2.add(100);
        ll2.add(600);
        ll2.add(700);
        ll2.add(800);

        System.out.println(ll2);

        System.out.println(ll2.removeFirst());
        System.out.println(ll2);
        System.out.println(ll2.poll());
        System.out.println(ll2);
        System.out.println(ll2.peek());
        System.out.println(ll2.get(2));

        ll2.clear();
        System.out.println(ll2.poll());
        System.out.println(ll2.remove());

    }

    public static void main(String[] args) {
        new Queue1().meth1();
    }
}
