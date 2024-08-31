package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","1104");
			CallableStatement cstmt = con.prepareCall("{call insertpro(?,?,?) }");
			cstmt.setInt(1,Integer.parseInt(args[0]));
			cstmt.setString(2, args [1]);
			cstmt.setInt(3,Integer.parseInt(args[2]));
			cstmt.execute();
			
			System.out.println("One Record Inserted Successfully");
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
