package Stream.DataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassA {

    void fileopration() throws Exception

    {
        System.out.println("Implemeting the DataStream");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\USER\\Desktop\\f3.sec"));
        System.out.println("Connection Created");

        dos.writeInt(1000);
        dos.writeBoolean(true);
        dos.writeChar('A');
        dos.writeInt(100);

        System.out.println("Data Entered securly");
        dos.close();

        System.out.println("===================");

        DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\USER\\Desktop\\f4.sec"));

        System.out.println("Connetion Created");
        System.out.println(dis.readInt());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        System.out.println(dis.readInt());

        System.out.println("Data retrived");

        dis.close();

    }

    public static void main(String[] args) throws Exception {
        ClassA aobj = new ClassA();
        aobj.fileopration();
    }
}
