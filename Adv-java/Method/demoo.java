import java.sql.*;

public class demoo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Class.forName("oracle.jdbc,driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1104");

            Statement stmt = con.createStatement();
            boolean b = stmt.execute("create table student(rollno number(3),name varchar2(10), marks number(3))");
            System.out.println("Create sussfully");
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
