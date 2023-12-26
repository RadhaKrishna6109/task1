package task;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opt = 1;
		
		while(opt == 1) {
			System.out.println("*********************************");
			System.out.println("Enter 1-> Register");
			System.out.println("Enter 2-> LogIn");
			System.out.println("Enter 3-> Leave");
			System.out.println("*********************************");
			int se = sc.nextInt();
			switch(se) {
			case 1 : 	register r = new register();
						r.registerusers();
						break;
			case 2 : 	login l = new login();
						l.logins();
						break;
			case 3 : 	System.out.println("Thank You");
						opt=2;
						break;
			}
			if(opt ==2) {
				break;
			}
			
		}

	}
}