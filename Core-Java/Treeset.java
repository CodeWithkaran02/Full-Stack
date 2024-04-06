import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

    void meth1() {
        System.out.println("Passing custon  into Treeset");

        TreeSet set = new TreeSet();
        set.add(10);
        set.add("Java");
        set.add(20);
        set.add(50);
        set.add(null);
        set.add(45);

        System.out.println(set);

        System.out.println("size :" + set);

        // System.out.println("get:"+get);
        System.out.println("Headset()" + set.headSet(96));
        System.out.println("tailset()" + set.tailSet(36));

        System.out.println("==========================");
        ArrayList al = new ArrayList();

        Iterator il = al.iterator();
        while (il.hasNext()) {
            System.out.println(il.next());
        }

        System.out.println("=============");

        Iterator i2 = al.iterator();

        while (i2.hasNext()) {
            System.out.println(i2.next());

        }

        Iterator i3 = al.iterator();

        while (i3.hasNext()) {
            System.out.println(i3.next());

        }

    }

    public static void main(String[] args) {
        new Treeset().meth1();
    }

}
