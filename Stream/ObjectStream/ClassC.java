package Stream.ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassC {
    public static void main(String[] args) throws Exception {
        System.out.println("Implemention object Stream");
        ClassA aobj = new ClassA();
        ClassB bobj = new ClassB();

        System.out.println(aobj.a + " " + aobj.b);
        System.out.println(bobj.x + " " + bobj.y);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\USER\\Desktop\\f5.ser"));
        System.out.println("Connetion Created");

        oos.writeObject(aobj);
        oos.writeObject(bobj);
        oos.close();
        System.out.println("Serilization Completed");
        System.out.println("=====================");

        System.out.println("De-Serilizatiom Starte");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\USER\\Desktop\\f6.ser"));

        ClassA aobj2 = (ClassA) ois.readObject();
        ClassB bobj2 = (ClassB) ois.readObject();

        System.out.println(aobj2.a + " " + aobj2.b);
        System.out.println(bobj2.x + " " + bobj2.y);
        ois.close();

    }

}
