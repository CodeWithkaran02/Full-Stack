import java.util.LinkedHashMap;
import java.util.Iterator;

public class LinkedHashnap1 {

    void meth1() {
        LinkedHashMap map = new LinkedHashMap();
        map.put(101, "Java");
        map.put("Java", 1000);
        map.put(null, null);
        map.put(103, "css");
        map.put(105, "Html");
        map.put(103, "Python");
        map.put(104, "java");

        System.out.println(map);
        map.put(106, "C++");
        System.out.println(map);
        System.out.println("=======================");
        System.out.println(map.get(103));

        System.out.println("===========================");

        System.out.println("Reterving the keyvalue from map");

        // LinkedHashMap map2 = new LinkedHashMap(map.entrySet());

    }

    public static void main(String[] args) {
        new LinkedHashnap1().meth1();
    }
}