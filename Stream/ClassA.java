package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamClassA {
    void fileopration1() throws Exception {
        System.out.println("Inpemention to stream read file ");
        FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Desktop\\f1.txt");
        System.out.println("Connetion Created");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println();
        System.out.println("Data retrived");
        fis.close();

    }

    void fileopration2() throws Exception {
        System.out.println("Implemation to Strean fileOutStream");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\USER\\Desktop\\f2.txt");
        System.out.println("Connetion Create ");
        String s = ", so I love it ";
        byte arr[] = s.getBytes();
        fos.write(arr);
        fos.close();

    }

    void fileopration3() throws Exception {
        System.out.println("Copying data ");
        FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Desktop\\f1.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\USER\\Desktop\\f2.txt");
        System.out.println("Conction creted");
        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        fis.close();
        fos.close();
        System.out.println("Data Retrive");

    }

    public static void main(String args[]) throws Exception {
        StreamClassA aobj = new StreamClassA();
        // aobj.fileopration1();
        aobj.fileopration2();
        aobj.fileopration3();
    }

}
