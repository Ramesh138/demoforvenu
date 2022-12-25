package krishna.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;



public class Dbconnection {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		/*
		 * 
		 * //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name" String
		 * dbUrl = "";
		 * 
		 * //Database Username String username = "";
		 * 
		 * //Database Password String password = "";
		 * 
		 * //Query to Execute String query =
		 * "";
		 * 
		 * //Load mysql jdbc driver Class.forName("com.mysql.jdbc.Driver");
		 * 
		 * //step1 load the driver class //
		 * Class.forName("oracle.jdbc.driver.OracleDriver");
		 * 
		 * //Create Connection to DB Connection con =
		 * DriverManager.getConnection(dbUrl,username,password);
		 * 
		 * //Create Statement Object Statement stmt = con.createStatement();
		 * 
		 * // Execute the SQL Query. Store results in ResultSet ResultSet rs=
		 * stmt.executeQuery(query);
		 */
		
		Connection con = null;
		Statement stmt = null;
		try {
			String url="";
			String user="";
			String password="";
			Class.forName("");
			
			con = DriverManager.getConnection(url, user, password);
			
			stmt = con.createStatement();
			
			ResultSet rs1=stmt.executeQuery("");
			
			
			
			/*
			 * int id = rs1.getInt("id"); String firstName = rs1.getString("first_name");
			 * String lastName = rs1.getString("last_name"); Date dateCreated =
			 * rs1.getDate("date_created"); boolean isAdmin = rs1.getBoolean("is_admin");
			 * int numPoints = rs1.getInt("num_points");
			 */
			
			while (rs1.next()) {
				int id = rs1.getInt("id");
			    String firstName = rs1.getString("first_name");
			    String lastName = rs1.getString("last_name");
			    Date dateCreated = rs1.getDate("date_created");
			    boolean isAdmin = rs1.getBoolean("is_admin");
			    int numPoints = rs1.getInt("num_points");
				
			}
		} catch (Exception e) {

			stmt.close();
			e.printStackTrace();
		}finally {
			
			con.close();
		}
		
		
	}

}
