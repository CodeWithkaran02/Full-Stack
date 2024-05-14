import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LinkedHashnap1 {

    void meth1() {
        LinkedHashMap hs = new LinkedHashMap();

        hs.put(101, "Java");

        hs.put("Java", 1000);

        hs.put(null, null);

        hs.put(103, "css");

        hs.put(105, "Html");

        hs.put(103, "Python");

        hs.put(104, "java");

        System.out.println(hs);

        hs.put(106, "C++");

        System.out.println(hs);

        System.out.println("=======================");

        System.out.println(hs.get(103));

        System.out.println("===========================");

        System.out.println("Reterving the keyvalue from map");

        LinkedHashMap hs2 = new LinkedHashMap(hs.entrySet());

        Iterator i = hs2.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());

        }

    }

    public static void main(String[] args) {
        new LinkedHashnap1().meth1();
    }
}