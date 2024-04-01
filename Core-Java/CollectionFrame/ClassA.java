package CollectionFrame;

import java.util.*;

public class toStringA extends Object {
    String StudentName;
    int StudentID;
    String StudentDept;

    public toStringA(String StudentName, int StudentID, String StudentDept) {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.StudentDept = StudentDept;
    }

    public String toString() {
        return StudentName + " " + StudentID + " " + StudentDept;

    }

    public static void main(String[] args) {

    }

}
