package Stream;

import java.io.*;

public class ClassA {
    void fileopration1() throws Exception
    {
        System.out.println("Connetion Created");
        FileInputStream fis = new FileInputStream("C:\Users\USER\Documents\f1.txt");
        int i ; 
        while((i=fis.read()!-1)){
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("Data retrived");
        fis.close();

    }
}
