package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class accuracy {
	public String accuraicieses(String email) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection kittu = null;
		try {
			kittu = DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","kittu@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query="select * from validity";
		PreparedStatement view;
		try {
			view = kittu.prepareStatement(query);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
				
				if(email.equals(rs.getString("v_Email"))) {
					if(rs.getBoolean("machine_learning")== false) {
						System.out.println("Machine Learning" + " - "+"Not Completed");
					}
					else {
						System.out.println("Machine Learning" + " - "+"Completed");
					}
					if(rs.getBoolean("cyber_security")== false) {
						System.out.println("Cyber Security" + " - "+"Not Completed");
					}
					else {
						System.out.println("Cyber Security" + " - "+"Completed");
					}
					if(rs.getBoolean("html")== false) {
						System.out.println("HTML" + " - "+"Not Completed");
					}
					else {
						System.out.println("HTML" + " - "+"Completed");
					}
					if(rs.getBoolean("css")== false) {
						System.out.println("CSS" + " - "+"Not Completed");
					}
					else {
						System.out.println("CSS" + " - "+"Completed");
					}
					if(rs.getBoolean("java_script")== false) {
						System.out.println("Java Script" + " - "+"Not Completed");
					}
					else {
						System.out.println("Java Script" + " - "+"Completed");
					}
				}
					
            	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return email;
	}

	

	
	

}