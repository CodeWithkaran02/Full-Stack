package lambda;

import javax.sql.rowset.spi.SyncResolver;

public class ClassB {

    void vote_eligibilty() {
        System.out.println("Checking vote eligibity");

        int age = 45;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote ");

        }

    }

    static void display() {
        System.out.println("this is static method referencing");

    }

    ClassB() {
        System.out.println("THis is construtor refreancing ");
        System.out.println("java is awesome");
    }
}
