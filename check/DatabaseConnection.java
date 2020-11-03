package check;
import java.sql.*;

public class DatabaseConnection {
	Connection c;
	Statement s;
	
	public DatabaseConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c =DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false","root","Anjali@29");
			s=c.createStatement();
			} catch (Exception e) {
			System.out.println(e);
		}	
	}

}
