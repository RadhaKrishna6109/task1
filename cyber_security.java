package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class cyber_security {
	Scanner sc=new Scanner(System.in);

	public void cyber_security() {
		// TODO Auto-generated method stub
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basic Cyber Security");
		System.out.println("Enter 2 for Intermediate Cyber Security");
		System.out.println("Enter 3 for Advanced Cyber Security");
		System.out.println("Enter 4 for Expert Cyber Security");
		int choice = sc.nextInt();
		String complete = null;
		if(choice==1) {
			System.out.println("Cybersecurity is the practice of protecting computer systems, networks, and data from digital attacks, "
	                + "unauthorized access, and data breaches.");

	        // Key Concepts
	        System.out.println("\nKey Concepts:");
	        System.out.println("1. Confidentiality: Ensuring that sensitive information is accessible only to authorized individuals or systems.");

	        System.out.println("2. Integrity: Maintaining the accuracy and reliability of data by preventing unauthorized modifications.");

	        System.out.println("3. Availability: Ensuring that systems and data are available and accessible when needed.");

	        System.out.println("4. Authentication: Verifying the identity of users or systems to prevent unauthorized access.");

	        System.out.println("5. Authorization: Granting appropriate permissions to authenticated users or systems.");

	        // Common Cybersecurity Threats
	        System.out.println("\nCommon Cybersecurity Threats:");
	        System.out.println("1. Malware: Software designed to harm or exploit systems, including viruses, worms, and ransomware.");

	        System.out.println("2. Phishing: Fraudulent attempts to obtain sensitive information by posing as a trustworthy entity.");

	        System.out.println("3. Denial of Service (DoS) Attacks: Overloading a system to disrupt its normal functioning.");

	        System.out.println("4. Man-in-the-Middle (MitM) Attacks: Intercepting and altering communication between two parties.");

	        // Security Measures
	        System.out.println("\nSecurity Measures:");
	        System.out.println("1. Firewalls: Network security systems that monitor and control incoming and outgoing traffic.");

	        System.out.println("2. Antivirus Software: Programs that detect, prevent, and remove malicious software.");

	        System.out.println("3. Encryption: Converting data into a secure format to prevent unauthorized access.");

	        System.out.println("4. Regular Software Updates: Keeping software, operating systems, and applications up-to-date to patch vulnerabilities.");

	        // Best Practices
	        System.out.println("\nBest Practices:");
	        System.out.println("1. Strong Passwords: Use complex and unique passwords for accounts.");

	        System.out.println("2. Two-Factor Authentication (2FA): Add an extra layer of security by requiring additional verification.");

	        System.out.println("3. Security Awareness Training: Educate users about cybersecurity risks and best practices.");

	        System.out.println("4. Data Backup: Regularly back up important data to mitigate the impact of potential data loss.");

	        System.out.println("\nRemember, cybersecurity is an ongoing effort, and staying informed about emerging threats is crucial to maintaining a secure digital environment.");
	        System.out.println("You completed 1st Stage of CYBER SECURITY");
	        complete = complete + "c";
	        System.out.println("If You want to continue enter 2");
	        choice = sc.nextInt();
	   
		}
		if(choice==2) {
			System.out.println("Intermediate cybersecurity builds upon the basics and involves a deeper exploration of "
	                + "advanced security measures, threat detection, and incident response.");

	        // Skills and Concepts
	        System.out.println("\nSkills and Concepts:");
	        System.out.println("1. Network Security Monitoring: Monitoring network traffic for signs of malicious activity.");

	        System.out.println("2. Intrusion Detection and Prevention Systems (IDPS): Systems that analyze network or system events for potential threats.");

	        System.out.println("3. Security Information and Event Management (SIEM): Collecting and analyzing log data to detect and respond to security incidents.");

	        System.out.println("4. Vulnerability Assessment: Identifying and addressing vulnerabilities in systems and applications.");

	        // Advanced Threats
	        System.out.println("\nAdvanced Threats:");
	        System.out.println("1. Advanced Persistent Threats (APTs): Long-term targeted cyberattacks often sponsored by nation-states.");

	        System.out.println("2. Zero-Day Exploits: Attacks that target undisclosed vulnerabilities before developers can provide a fix.");

	        System.out.println("3. Social Engineering: Manipulating individuals to disclose sensitive information.");

	        // Security Measures
	        System.out.println("\nAdvanced Security Measures:");
	        System.out.println("1. Endpoint Detection and Response (EDR): Monitoring and responding to threats at the endpoint level.");

	        System.out.println("2. Deception Technology: Creating decoy systems and data to mislead attackers.");

	        System.out.println("3. Security Automation and Orchestration: Streamlining and automating security processes.");

	        System.out.println("4. Incident Response Planning: Developing and implementing plans to respond to security incidents.");

	        // Best Practices
	        System.out.println("\nBest Practices:");
	        System.out.println("1. Continuous Monitoring: Regularly monitoring and analyzing security events.");

	        System.out.println("2. Threat Intelligence Sharing: Collaborating with other organizations to share information about emerging threats.");

	        System.out.println("3. Red Team and Blue Team Exercises: Simulating cyberattacks and defense strategies to improve readiness.");

	        System.out.println("4. Regular Security Audits: Assessing and validating the effectiveness of security controls.");

	        System.out.println("\nIntermediate cybersecurity requires a deeper understanding of advanced threats and the implementation of sophisticated security measures.");
	        System.out.println("You completed 2st Stage of CYBER SECURITY");
	        complete = complete + "o";
	        System.out.println("If You want to continue enter 3");
	        choice = sc.nextInt();
	    
		}
		if(choice==3) {
			 System.out.println("Advanced cybersecurity involves a high level of proficiency, research, and innovation in the field. "
		                + "Experts at this level contribute to the development of new security paradigms and lead the way in defending against sophisticated threats.");

		        // Skills and Concepts
		        System.out.println("\nSkills and Concepts:");
		        System.out.println("1. Threat Hunting: Proactively searching for signs of advanced threats within an environment.");

		        System.out.println("2. Cyber Threat Intelligence Analysis: Analyzing and interpreting threat intelligence data to anticipate and prevent cyberattacks.");

		        System.out.println("3. Cryptography and Advanced Encryption: Implementing advanced cryptographic techniques to secure communications and data.");

		        System.out.println("4. Reverse Engineering: Analyzing malware and understanding its inner workings.");

		        // Advanced Threats
		        System.out.println("\nAdvanced Threats:");
		        System.out.println("1. Nation-State Cyber Espionage: Covert cyber activities conducted by governments for intelligence gathering or sabotage.");

		        System.out.println("2. Ransomware-as-a-Service (RaaS): Cybercriminals renting ransomware services to other attackers.");

		        System.out.println("3. Fileless Malware: Malicious code that operates in memory without leaving traditional traces on disk.");

		        // Security Measures
		        System.out.println("\nAdvanced Security Measures:");
		        System.out.println("1. Threat Intelligence Platforms (TIP): Tools that aggregate, correlate, and analyze threat intelligence data.");

		        System.out.println("2. Cyber Deception Platforms: Creating realistic decoy systems to confuse and mislead attackers.");

		        System.out.println("3. Quantum-Safe Cryptography: Preparing for the post-quantum era by implementing algorithms resistant to quantum computing attacks.");

		        System.out.println("4. AI and Machine Learning in Cybersecurity: Leveraging advanced algorithms for threat detection and analysis.");

		        // Best Practices
		        System.out.println("\nBest Practices:");
		        System.out.println("1. Active Defense Strategies: Actively engaging with attackers to disrupt their activities.");

		        System.out.println("2. Cybersecurity Drills and Simulations: Regularly conducting realistic scenarios to test and improve incident response capabilities.");

		        System.out.println("3. Zero Trust Security Model: Verifying the identity and trustworthiness of all users and devices, regardless of their location.");

		        System.out.println("4. Cybersecurity Research and Collaboration: Actively contributing to research and collaborating with industry experts to stay ahead of emerging threats.");

		        System.out.println("\nBecoming an expert in advanced cybersecurity requires continuous learning, research, and a proactive approach to understanding and countering evolving threats.");
		        System.out.println("You completed 3st Stage of CYBER SECURITY");
		        complete = complete + "m";
		        System.out.println("If You want to continue enter 4");
		        choice = sc.nextInt();
		    
		}
		if(choice==4) {
			System.out.println("Expert-level cybersecurity involves a profound understanding of complex threats, "
	                + "advanced security architecture design, and leadership in securing large-scale enterprise environments.");

	        // Skills and Concepts
	        System.out.println("\nSkills and Concepts:");
	        System.out.println("1. Advanced Cryptanalysis: Breaking and analyzing cryptographic systems for vulnerabilities.");

	        System.out.println("2. Security Architecture Design: Designing and implementing robust, scalable, and resilient security infrastructures.");

	        System.out.println("3. Advanced Threat Modeling: Identifying and mitigating potential security threats through systematic analysis.");

	        System.out.println("4. Security Compliance and Governance: Ensuring adherence to industry regulations and implementing effective governance.");

	        // Advanced Threats
	        System.out.println("\nAdvanced Threats:");
	        System.out.println("1. Coordinated Advanced Persistent Threats (APTs): Sustained and targeted attacks orchestrated by sophisticated adversaries.");

	        System.out.println("2. AI-Enhanced Cyberattacks: Threats leveraging artificial intelligence to enhance attack strategies.");

	        System.out.println("3. Supply Chain Attacks: Targeting vulnerabilities in the supply chain to compromise organizations indirectly.");

	        // Security Measures
	        System.out.println("\nAdvanced Security Measures:");
	        System.out.println("1. Cybersecurity Orchestration and Automation: Integrating and automating security processes for efficiency and speed.");

	        System.out.println("2. Zero Knowledge Security Models: Implementing security models where service providers have zero access to user data.");

	        System.out.println("3. Quantum Key Distribution: Leveraging quantum physics to secure communication channels against quantum attacks.");

	        System.out.println("4. Threat Hunting Platforms: Advanced tools for proactively seeking and eliminating threats within networks.");

	        // Best Practices
	        System.out.println("\nBest Practices:");
	        System.out.println("1. Cybersecurity Leadership: Providing strategic guidance and leadership in developing and executing cybersecurity initiatives.");

	        System.out.println("2. Cybersecurity Incident Command Systems (CICS): Implementing structured frameworks for effective incident response and coordination.");

	        System.out.println("3. Continuous Security Training and Education Programs: Ensuring that security teams and organizations stay ahead of evolving threats.");

	        System.out.println("4. Cross-Disciplinary Collaboration: Collaborating with legal, compliance, and risk management teams to address holistic cybersecurity challenges.");

	        System.out.println("\nBecoming an expert in cybersecurity requires continuous learning, hands-on experience, and a commitment to staying at the forefront of cybersecurity innovations.");
	        System.out.println();System.out.println("********************************************************************************************************************************");
			complete = complete + "l";
	        int c=0;
	        int o=0;
	        int m=0;
	        int l=0;
	        int e=0;
	        for(int i=0; i<complete.length(); i++) {
	        	if( complete.contains("c")) {
	        		c=1;
	        	}
	        	if(complete.contains("o")) {
	        		o=1;
	        	}
	        	if(complete.contains("m")) {
	        		m=1;
	        	}
	        	
	        	if(complete.contains("l")) {
	        		l=1;
	        	}
	        }
	        if(c==0) {
	        	System.out.println("To Get certificate comlete Basic CYBER SECURITY");
	        	e=1;
	        }
	        if(o==0) {
	        	System.out.println("To Get certificate comlete Intermediate CYBER SECURITY");
	        	e=1;
	        }
	        if(m==0) {
	        	System.out.println("To Get certificate comlete Advanced CYBER SECURITY");
	        	e=1;
	        }
	        
	        if (e==0) {
	        	System.out.println("Please confirm your email to send certificate to your mail");
	        	String email = sc.next();
	        	try {
	    			Class.forName("com.mysql.cj.jdbc.Driver");
	    		} catch (ClassNotFoundException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	    		Connection krish = null;
	    		try {
	    			krish = DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","kittu@123");
	    		} catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	    		String query="select * from register";
	    		PreparedStatement view;
	        	try {
	    			int user=1;
	    			view = krish.prepareStatement(query);
	    			ResultSet rs = view.executeQuery();
	    			while (rs.next()) {
	    	            if(email.equals(rs.getString("user_Email"))) {
	    	            	user=2;
	    	            	
	    	            	
	    	        		String updateProductQuery = "UPDATE validity SET cyber_security = ? WHERE v_Email = ?";
                            try (PreparedStatement updateProductStatement = krish.prepareStatement(updateProductQuery)) {
                                updateProductStatement.setInt(1, 1);
                                updateProductStatement.setString(2, email);
                                updateProductStatement.executeUpdate();
                            }
	    	            }
	    			}
	    			if(user == 1) {
	    				System.out.println("Please enter your email with registerd email");
	    				
	    			}
	    			else {
	    				System.out.println("Your certificate is send to your mail....");
	    			}
	        	
	        	}
	        	catch (SQLException e1) {
	    			// TODO Auto-generated catch block
	    			e1.printStackTrace();
	    		}
	        }
	   
		}
	}

}
