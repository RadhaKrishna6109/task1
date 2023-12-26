package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class html {
	Scanner sc=new Scanner(System.in);

	public void html() {
		// TODO Auto-generated method stub
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basic HTML");
		System.out.println("Enter 2 for Intermediate HTML");
		System.out.println("Enter 3 for Advanced HTML");
		System.out.println("Enter 4 for Expert HTML");
		int choice = sc.nextInt();
		String complete = null;
		if(choice==1) {
			System.out.println("HTML (Hypertext Markup Language) is the standard markup language used to create and structure content on the web.");

	        // Key Concepts
	        System.out.println("\nKey Concepts:");
	        System.out.println("1. Tags: HTML uses tags to define elements and their attributes. Tags are enclosed in angle brackets (<>).");

	        System.out.println("2. Elements: Elements are the building blocks of HTML and consist of a start tag, content, and an end tag.");

	        System.out.println("3. Attributes: Attributes provide additional information about HTML elements and are included in the opening tag.");

	        // Basic HTML Structure
	        System.out.println("\nBasic HTML Structure:");
	        System.out.println("<!DOCTYPE html>");
	        System.out.println("<html>");
	        System.out.println("  <head>");
	        System.out.println("    <title>My First HTML Page</title>");
	        System.out.println("  </head>");
	        System.out.println("  <body>");
	        System.out.println("    <h1>Hello, World!</h1>");
	        System.out.println("    <p>This is a basic HTML page.</p>");
	        System.out.println("  </body>");
	        System.out.println("</html>");

	        // Common HTML Tags
	        System.out.println("\nCommon HTML Tags:");
	        System.out.println("1. <h1>, <h2>, ..., <h6>: Headings for different levels.");
	        System.out.println("2. <p>: Paragraph.");
	        System.out.println("3. <a>: Anchor for links.");
	        System.out.println("4. <img>: Image.");
	        System.out.println("5. <ul>, <ol>, <li>: Unordered list, ordered list, list item.");

	        // HTML Forms
	        System.out.println("\nHTML Forms:");
	        System.out.println("<form action='/submit' method='post'>");
	        System.out.println("  <label for='username'>Username:</label>");
	        System.out.println("  <input type='text' id='username' name='username'><br>");
	        System.out.println("  <label for='password'>Password:</label>");
	        System.out.println("  <input type='password' id='password' name='password'><br>");
	        System.out.println("  <input type='submit' value='Submit'>");
	        System.out.println("</form>");

	        // Resources for Learning
	        System.out.println("\nResources for Learning:");
	        System.out.println("1. W3Schools (https://www.w3schools.com/html/): Interactive tutorials and references for HTML.");
	        System.out.println("2. MDN Web Docs (https://developer.mozilla.org/en-US/docs/Web/HTML): Mozilla's documentation on HTML.");

	        System.out.println("\nHTML is the foundation of web development, and learning its basics is essential for anyone aspiring to create content for the web.");
	        System.out.println("You completed 1st Stage of HTML");
	        complete = complete + "c";
	        System.out.println("If You want to continue enter 2");
	        choice = sc.nextInt();
		}
		if(choice==2) {
			 System.out.println("Intermediate HTML involves a deeper understanding of advanced HTML features, "
		                + "including forms, multimedia, and the use of CSS for styling.");

		        // Advanced HTML Structure
		        System.out.println("\nAdvanced HTML Structure:");
		        System.out.println("<!DOCTYPE html>");
		        System.out.println("<html lang='en'>");
		        System.out.println("  <head>");
		        System.out.println("    <meta charset='UTF-8'>");
		        System.out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		        System.out.println("    <link rel='stylesheet' href='styles.css'>");
		        System.out.println("    <title>Intermediate HTML Page</title>");
		        System.out.println("  </head>");
		        System.out.println("  <body>");
		        System.out.println("    <header>");
		        System.out.println("      <h1>Welcome to My Website</h1>");
		        System.out.println("    </header>");
		        System.out.println("    <nav>");
		        System.out.println("      <ul>");
		        System.out.println("        <li><a href='#'>Home</a></li>");
		        System.out.println("        <li><a href='#'>About</a></li>");
		        System.out.println("        <li><a href='#'>Contact</a></li>");
		        System.out.println("      </ul>");
		        System.out.println("    </nav>");
		        System.out.println("    <main>");
		        System.out.println("      <article>");
		        System.out.println("        <h2>Article Title</h2>");
		        System.out.println("        <p>This is a longer piece of content in the article.</p>");
		        System.out.println("      </article>");
		        System.out.println("      <section>");
		        System.out.println("        <h2>Featured Section</h2>");
		        System.out.println("        <p>This section features important content.</p>");
		        System.out.println("      </section>");
		        System.out.println("    </main>");
		        System.out.println("    <footer>");
		        System.out.println("      <p>&copy; 2023 My Website</p>");
		        System.out.println("    </footer>");
		        System.out.println("  </body>");
		        System.out.println("</html>");

		        // Multimedia in HTML
		        System.out.println("\nMultimedia in HTML:");
		        System.out.println("<img src='image.jpg' alt='Description of the image'>");
		        System.out.println("<audio controls>");
		        System.out.println("  <source src='audio.mp3' type='audio/mp3'>");
		        System.out.println("  Your browser does not support the audio tag.");
		        System.out.println("</audio>");
		        System.out.println("<video width='320' height='240' controls>");
		        System.out.println("  <source src='video.mp4' type='video/mp4'>");
		        System.out.println("  Your browser does not support the video tag.");
		        System.out.println("</video>");

		        // Forms in HTML
		        System.out.println("\nForms in HTML:");
		        System.out.println("<form action='/submit' method='post'>");
		        System.out.println("  <label for='name'>Name:</label>");
		        System.out.println("  <input type='text' id='name' name='name' required><br>");
		        System.out.println("  <label for='email'>Email:</label>");
		        System.out.println("  <input type='email' id='email' name='email' required><br>");
		        System.out.println("  <label for='message'>Message:</label>");
		        System.out.println("  <textarea id='message' name='message' rows='4' required></textarea><br>");
		        System.out.println("  <input type='submit' value='Submit'>");
		        System.out.println("</form>");

		        System.out.println("\nIntermediate HTML involves creating more complex page structures, incorporating multimedia, and using advanced HTML features.");
		        System.out.println("You completed 2st Stage of HTML");
		        complete = complete + "o";
		        System.out.println("If You want to continue enter 3");
		        choice = sc.nextInt();
		   
		}
		if(choice==3) {
			 System.out.println("Advanced HTML involves mastering responsive design, accessibility, and the use of modern HTML features.");

		        // Responsive Design in HTML
		        System.out.println("\nResponsive Design in HTML:");
		        System.out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		        System.out.println("<style>");
		        System.out.println("  @media (min-width: 768px) {");
		        System.out.println("    /* Styles for larger screens */");
		        System.out.println("  }");
		        System.out.println("</style>");

		        // Accessibility in HTML
		        System.out.println("\nAccessibility in HTML:");
		        System.out.println("<nav>");
		        System.out.println("  <ul>");
		        System.out.println("    <li><a href='#' aria-current='page'>Home</a></li>");
		        System.out.println("    <li><a href='#'>About</a></li>");
		        System.out.println("    <li><a href='#'>Contact</a></li>");
		        System.out.println("  </ul>");
		        System.out.println("</nav>");
		        System.out.println("<img src='accessible-image.jpg' alt='Description of the accessible image'>");

		        // Modern HTML Features
		        System.out.println("\nModern HTML Features:");
		        System.out.println("<article>");
		        System.out.println("  <h2>Modern HTML Features</h2>");
		        System.out.println("  <p>HTML5 introduces new semantic elements such as <section>, <article>, <nav>, <header>, <footer>, and <aside>.</p>");
		        System.out.println("  <p>Additionally, HTML5 supports native audio and video elements, form enhancements, and more.</p>");
		        System.out.println("</article>");

		        // HTML5 Semantic Elements
		        System.out.println("\nHTML5 Semantic Elements:");
		        System.out.println("<header>");
		        System.out.println("  <h1>Website Header</h1>");
		        System.out.println("</header>");
		        System.out.println("<nav>");
		        System.out.println("  <!-- Navigation menu here -->");
		        System.out.println("</nav>");
		        System.out.println("<section>");
		        System.out.println("  <article>");
		        System.out.println("    <!-- Main content here -->");
		        System.out.println("  </article>");
		        System.out.println("  <aside>");
		        System.out.println("    <!-- Sidebar or additional content here -->");
		        System.out.println("  </aside>");
		        System.out.println("</section>");
		        System.out.println("<footer>");
		        System.out.println("  <!-- Footer content here -->");
		        System.out.println("</footer>");

		        System.out.println("\nAdvanced HTML involves creating websites with responsive designs, ensuring accessibility, and leveraging modern HTML features for enhanced structure and functionality.");
		        System.out.println("You completed 3st Stage of HTML");
		        complete = complete + "m";
		        System.out.println("If You want to continue enter 4");
		        choice = sc.nextInt();
		    
		}
		if(choice==4) {
			System.out.println("Expert-level HTML involves mastery of advanced web development techniques, including interactivity and dynamic content.");

	        // HTML5 and Web Components
	        System.out.println("\nHTML5 and Web Components:");
	        System.out.println("HTML5 introduces semantic elements and Web Components, enabling the creation of reusable custom elements.");
	        System.out.println("<article>");
	        System.out.println("  <h2>Creating a Web Component</h2>");
	        System.out.println("  <custom-element></custom-element>");
	        System.out.println("</article>");

	        // Embedding JavaScript in HTML
	        System.out.println("\nEmbedding JavaScript in HTML:");
	        System.out.println("<script>");
	        System.out.println("  function greet() {");
	        System.out.println("    alert('Hello, World!');");
	        System.out.println("  }");
	        System.out.println("</script>");
	        System.out.println("<button onclick='greet()'>Click Me</button>");

	        // HTML Templates and Shadow DOM
	        System.out.println("\nHTML Templates and Shadow DOM:");
	        System.out.println("<template id='my-template'>");
	        System.out.println("  <p>This is a template content.</p>");
	        System.out.println("</template>");
	        System.out.println("<script>");
	        System.out.println("  const template = document.getElementById('my-template');");
	        System.out.println("  const clone = document.importNode(template.content, true);");
	        System.out.println("  document.body.appendChild(clone);");
	        System.out.println("</script>");

	        // Responsive Design with CSS Grid
	        System.out.println("\nResponsive Design with CSS Grid:");
	        System.out.println("<style>");
	        System.out.println("  body {");
	        System.out.println("    display: grid;");
	        System.out.println("    grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));");
	        System.out.println("    grid-gap: 20px;");
	        System.out.println("  }");
	        System.out.println("</style>");

	        // Server-Side Includes (SSI)
	        System.out.println("\nServer-Side Includes (SSI):");
	        System.out.println("<!--#include virtual='/includes/header.html' -->");
	        System.out.println("<p>Main Content</p>");
	        System.out.println("<!--#include virtual='/includes/footer.html' -->");

	        System.out.println("\nExpert-level HTML involves integrating JavaScript, CSS, and other technologies to create dynamic, interactive, and highly responsive web applications.");
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
	        	System.out.println("To Get certificate comlete Basic HTML");
	        	e=1;
	        }
	        if(o==0) {
	        	System.out.println("To Get certificate comlete Intermediate HTML");
	        	e=1;
	        }
	        if(m==0) {
	        	System.out.println("To Get certificate comlete Advanced HTML");
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
	    	            	
	    	            	
	    	        		String updateProductQuery = "UPDATE validity SET html = ? WHERE v_Email = ?";
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
