package CollectionFrame;

import java.util.*;

public class ClassBtoSting {
    void meth1() {
        System.out.println("Passing our objecr into ArrayList");
        ArrayList<ClassA> al = new ArrayList<ClassA>();

        ClassA aobj1 = new ClassA("Ram", 101, "MCA");
        ClassA aobj2 = new ClassA("Rahem", 102, "B tech");
        ClassA aobj3 = new ClassA("John", 103, "BE");
        ClassA aobj4 = new ClassA("Sam", 104, "Mtech");
        ClassA aobj5 = new ClassA("Sonu", 105, "Phd");

        al.add(aobj1);
        al.add(aobj2);
        al.add(aobj3);
        al.add(aobj4);
        al.add(aobj5);

        System.out.print(al);
        System.out.println();
        System.out.println("Reterving the data by using Iteretor Interface");

        System.out.println();
        Iterator<ClassA> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }

    }

    public static void main(String[] args) {
        new ClassBtoSting().meth1();
    }
}
