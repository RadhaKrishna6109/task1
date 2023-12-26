package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class login {
	String email;
    String password;
    Scanner sc = new Scanner(System.in);
	public void logins() {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Email Id : ");
		email = sc.next();
		System.out.println("Enter Your Password : ");
		password = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection radha = null;
		try {
			radha = DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","kittu@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query="select * from register";
		PreparedStatement view;
		try {
			int user=1;
			view = radha.prepareStatement(query);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
	            if(email.equals(rs.getString("user_Email")) && password.equals(rs.getString("user_Password"))) {
	            	int opt = 1;
	            	user=2;
	            	System.out.println("*********************************");
        			System.out.println("Your Logged into the website");
        			System.out.println("*********************************");
					while(opt  == 1) {
						
						System.out.println("*********************************");
	        			System.out.println("Enter 1-> Diplay the courses");
	        			System.out.println("Enter 2-> Accuracy");
	        			System.out.println("Enter 3-> log out");
	        			System.out.println("*********************************");
	        			System.out.println("");
	        			int select = sc.nextInt();
	        			
	        			
	        			if(select == 1) {
	        				display s=new display();
	        				s.displays();
	        			}
	        			if(select == 2) {
	        				accuracy a=new accuracy();
	        				email = a.accuraicieses(email);
	        				
	        			}
	        			if(select == 3) {
	        				System.out.println("*********************************");
	        				System.out.println("You are Logged Out");
	        				System.out.println("Thank You !");
	        				System.out.println("*********************************");
	        				opt = 2;
	        				break;
	        				
	        			}
	        			
	        			
	        		}
					
	            }
	            
			}
			if(user == 1) {
	           	System.out.println(" Your User Name or Password are wrong");
	           	System.out.println("Please check it once");
	            
			}
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}	
	
