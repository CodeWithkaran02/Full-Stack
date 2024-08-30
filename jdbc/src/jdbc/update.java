package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1104");
			Statement  stmt = con.createStatement();
			
			stmt.executeUpdate("update student set marks =55 where rollno=3");
			
			System.out.println("One Record update successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
