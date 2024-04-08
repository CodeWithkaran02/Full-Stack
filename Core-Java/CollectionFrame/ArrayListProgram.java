package CollectionFrame;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {
    void meth1() {
        ArrayList<String> list = new ArrayList<String>();

        list.add(null);
        list.add(0, "Zero");
        list.add(null);
        list.add(2, "Two");
        list.add("four");
        list.add(1, "one");
        list.remove(2);

        System.out.println(list);

    }

    void meth2() {
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("Orange");
        fruitList.add("Mango");
        fruitList.add("Banana");

        int size = fruitList.size();
        String[] fruitArray = new String[size];
        fruitArray = fruitList.toArray(fruitArray);

        for (String str : fruitArray) {
            System.out.println(str + " ");

        }
    }

    void meth3() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(0, 30);
        list.add(2, 40);
        list.add(40);

        Object element = list.get(1);
        System.out.println(element);

    }

    public static void main(String args[]) {
        ArrayListProgram alp = new ArrayListProgram();
        alp.meth1();
        System.out.println("-=========================");
        alp.meth2();
        System.out.println("-=========================");
        alp.meth3();
    }
}
