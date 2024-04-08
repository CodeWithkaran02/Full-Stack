package CollectionFrame;

import java.util.*;

public class ClassA extends Object {
    String StudentName;
    int StudentID;
    String StudentDept;

    public ClassA(String StudentName, int StudentID, String StudentDept) {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.StudentDept = StudentDept;
    }

    public String toString() {
        return StudentName + " " + StudentID + " " + StudentDept;

    }

}
