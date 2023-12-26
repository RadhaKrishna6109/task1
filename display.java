package task;

import java.util.Scanner;

public class display {

	public void displays() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			// TODO Auto-generated method stub
			System.out.println("**************************");
			System.out.println("Courses Available");
			System.out.println("Enter 1-> Machine Learning");
			System.out.println("Enter 2-> Cyber Security");
			System.out.println("Enter 3-> HTML");
			System.out.println("Enter 4-> CSS");
			System.out.println("Enter 5-> Java Script");
			System.out.println("**************************");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				machine_learning ml = new machine_learning();
				ml.machine_learning();
			}
			else if(choice == 2) {
				cyber_security h = new cyber_security();
				h.cyber_security();
			}
			else if(choice == 3) {
				html ht = new html();
				ht.html();
			}
			else if(choice == 4) {
				css cs = new css();
				cs.css();
			}
			else if(choice == 5) {
				java_script js = new java_script();
				js.java_script();
			}
		}
		
	}

