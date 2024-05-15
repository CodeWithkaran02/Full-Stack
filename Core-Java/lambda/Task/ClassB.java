package lambda.Task;

import java.util.*;
import java.util.stream.Collector;

public class ClassB {

    void meth1() {

        System.out.println("Implemetion the salary of each employer whose age is greater than 25 by 10%");

        ArrayList<ClassA> al = new ArrayList<ClassA>();

        ClassA aobj1 = new ClassA("Kishan ", 34, 50000);
        ClassA aobj2 = new ClassA("Sonu ", 23, 39000);
        ClassA aobj3 = new ClassA("karan", 25, 54000);
        ClassA aobj4 = new ClassA("Karuna ", 28, 24000);

        al.add(aobj1);
        al.add(aobj2);
        al.add(aobj3);
        al.add(aobj4);
        System.out.println(al + "\n");
        
        al.forEach(data->System.out.println(data));

        Stream<ClassA> s1 = al.Stream().map.(data->

            if(data.getempAge>25){
                data.setempSal(data.getempSal() * 1.10f);
            }
        );
        return data;

        ArrayList<ClassA> al2 = (ArrayList<ClassA>)s1.collect(Collector.toList());

        for(Object o : al2 ){
            System.out.println("=======================");


        }
        al2.forEach(data->System.out.println(data));


    }

    public static void main(String[] args) {
        new ClassB().meth1();
    }
}
