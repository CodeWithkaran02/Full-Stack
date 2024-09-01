package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1104");
			
			
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = stmt.executeQuery("select * from student");
			
			rs.absolute(4);
			
			
			
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getInt(3)+"\t");
			
			System.out.println("one record executed successfull");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
       
