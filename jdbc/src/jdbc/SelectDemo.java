package jdbc;
import java.sql.*;
public class SelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1104");
			
			PreparedStatement pstmt = con.prepareStatement("select  marks from student where rollno  = ?");
			
			pstmt.setInt(1,Integer.parseInt(args [0]));
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getInt(1));
				
			}
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
