import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {
    void meth1() {
        ArrayList<String> list = new ArrayList<String>();

        list.add(null);
        list.add(0, "Zero");
        list.add(null);
        list.add(1, "One");
        list.add(2, "Two");
        list.add(3, "Three ");
        list.add(4, "Four");
        list.add(5, "Five");

        System.out.println(list);

    }

    void meth2() {
        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Banana");

        int size = fruit.size();

        String[] fruitArray = new String[size];

        fruitArray = fruit.toArray(fruitArray);

        for (String str : fruitArray) {
            System.out.println(str + " ");
        }

    }

    void meth3() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(200);
        list.add(0, 30);
        list.add(2, 40);
        list.add(40);

        Object element = list.get(1);

        System.out.println(element);

    }

    public static void main(String[] args) {
        Arraylist2 al = new Arraylist2();
        al.meth1();
        System.out.println("=========================");
        al.meth2();
        System.out.println("==========================");
        al.meth3();
    }
}
