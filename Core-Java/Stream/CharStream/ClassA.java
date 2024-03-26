package Stream.CharStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;

public class ClassA {

    void fileopration1() throws Exception {
        System.out.println("Reading the data by using Buffered Byte Stream ");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\USER\\Desktop\\f1.txt"));
        {
            System.out.println("Connetion Created");

            int i;
            while ((i = bis.read()) != -1) {
                System.out.println((char) i);

            }

        }
        System.out.println("Data Reterived");
        System.out.println("=========================");

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\USER\\Desktop\\f2.txt"));

        String data = ", today is Saturday";
        byte arr[] = data.getBytes(data);

        System.out.println("Data wrtten");
        // bos.flush();
        bos.close();

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\f1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\USER\\Desktop\\f2.txt"));

    }

    public static void main(String[] args) throws Exception {
        ClassA aobj = new ClassA();
        aobj.fileopration1();
    }
}
