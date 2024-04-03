import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.management.ValueExp;

public class hascode {

    void meth1() {
        HashSet set = new HashSet();
        set.add(10);
        set.add("Java");
        set.add(null);
        set.add(45);
        set.add(54);
        set.add(45);
        set.add(9);
        set.add(80);

        System.out.println(set);

        System.out.println("Size:" + set.size());

        System.out.println("===============================");

        ArrayList al = new ArrayList(set);
        new Vector(set);
        new LinkedList(set);

        System.out.println("Arraylist:" + al);
        System.out.println("get" + al.get(2));

        System.out.println("==================");
        System.out.println("Retering the data by using Iterator Interface");

        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }

    }

    public static void main(String[] args) {
        new hascode().meth1();
    }
}
