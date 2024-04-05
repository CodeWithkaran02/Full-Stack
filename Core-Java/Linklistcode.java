import java.util.LinkedList;
import java.util.ListIterator;

public class Linklistcode {

    void meth1() {
        System.out.println("implementing Linklist");

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(10);
        ll.add(25);
        ll.add(63);
        ll.add("Java");
        ll.add(null);

        ll.add(100);
        ll.add(42);

        System.out.println(ll);

        System.out.println("Reterving tha data v=usring for each");

        for (Object o : ll) {
            System.out.println(o + " ");

        }

        System.out.println();

        System.out.println("===============");

        System.out.println("Retriving the data using ListIterator");

        ListIterator li = ll.listIterator();

        while (li.hasNext()) {
            System.out.print(li.next());

        }
        System.out.println();

        System.out.println("========================================");

        while (li.hasPrevious()) {

            System.out.print(li.previous());

        }
        System.out.println();

        System.out.println("==============================");

        System.out.println("getFirst() :" + ll.getFirst());

        System.out.println("getlast:" + ll.getLast());

        System.out.println(ll);

        System.out.println("removeFirst:" + ll.removeFirst());

        System.out.println(ll);

        ll.add(45);

        System.out.println(ll);

    }

    public static void main(String[] args) {
        new Linklistcode().meth1();
    }
}
