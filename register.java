package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class register {
	String user_Email;
    String user_Name;
    String user_Password;
    int r_Id;
    
    Scanner sc = new Scanner(System.in);
	public void registerusers() {
		
		// TODO Auto-generated method stub
		System.out.println("Enter Your Name : ");
		user_Name = sc.next();
		System.out.println("Enter Your Email : ");
		user_Email = sc.next();
		System.out.println("Enter Your Password : ");
		user_Password = sc.next();
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection kittu = null;
        try {
            kittu = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "kittu@123");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query1="select * from register";
		PreparedStatement view;
		try {
			
			view = kittu.prepareStatement(query1);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
	            if(user_Email.equals(rs.getString("user_Email"))) {
	            	System.out.println("you email is already exist");
	            	return;
	            }
	            
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String query = "INSERT INTO register(user_Name, user_Email, user_Password) VALUES (?, ?, ?)";

        try (PreparedStatement ps = kittu.prepareStatement(query)) {
            ps.setString(1, user_Name);
            ps.setString(2, user_Email);
            ps.setString(3, user_Password);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        String query11="select * from register";
		PreparedStatement view1;
		try {
			
			view1 = kittu.prepareStatement(query11);
			ResultSet rs = view1.executeQuery();
			while (rs.next()) {
	            if(user_Email.equals(rs.getString("user_Email"))) {
	            	r_Id = rs.getInt("user_Id");
	            }
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	            	
		
		int opt = 1;
		
		while(opt == 1) {
			System.out.println("*********************************");
			System.out.println("Your Registration is successful");
			System.out.println("*********************************");
			System.out.println("Enter->1->Login");
			System.out.println("Enter->2->Leave");
			int select = sc.nextInt();
			String insertProductQuery = "INSERT INTO validity (v_Id, v_Name, v_Email,machine_learning,cyber_security,html,css,java_script) VALUES (?, ?, ?, '0', '0', '0', '0', '0')";
            try (PreparedStatement insertps = kittu
                    .prepareStatement(insertProductQuery)) {
                insertps.setInt(1, r_Id);
                insertps.setString(2, user_Name);
                insertps.setString(3, user_Email);
                insertps.executeUpdate();
            }
            catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
			
			if(select == 1) {
				login l = new login();
				l.logins();
				System.out.println("Thanks for visiting");
				opt = 2;
			}
			else if(select == 2) {
				System.out.println("Thanks for visiting");
				opt = 2;
			}
		}
		
	}

}

