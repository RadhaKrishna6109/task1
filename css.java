package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class css {
	Scanner sc=new Scanner(System.in);

	public void css() {
		// TODO Auto-generated method stub
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basic CSS");
		System.out.println("Enter 2 for Intermediate CSS");
		System.out.println("Enter 3 for Advanced CSS");
		System.out.println("Enter 4 for Expert CSS");
		int choice = sc.nextInt();
		String complete = null;
		if(choice==1) {
			System.out.println("CSS (Cascading Style Sheets) is a style sheet language used to describe the presentation of a document written in HTML.");

	        // Key Concepts
	        System.out.println("\nKey Concepts:");
	        System.out.println("1. Selectors: CSS selectors are patterns that select and style HTML elements.");

	        System.out.println("2. Properties: CSS properties define the visual style of selected elements, such as color, font size, and margin.");

	        System.out.println("3. Values: CSS property values specify the actual style applied, such as 'red' for color or '20px' for font size.");

	        // Basic CSS Syntax
	        System.out.println("\nBasic CSS Syntax:");
	        System.out.println("selector {");
	        System.out.println("  property: value;");
	        System.out.println("}");

	        // Example Styles
	        System.out.println("\nExample Styles:");
	        System.out.println("body {");
	        System.out.println("  font-family: 'Arial', sans-serif;");
	        System.out.println("  background-color: #f0f0f0;");
	        System.out.println("}");

	        System.out.println("h1 {");
	        System.out.println("  color: blue;");
	        System.out.println("  text-align: center;");
	        System.out.println("}");

	        System.out.println("p {");
	        System.out.println("  font-size: 16px;");
	        System.out.println("  margin-bottom: 20px;");
	        System.out.println("}");

	        // Linking CSS to HTML
	        System.out.println("\nLinking CSS to HTML:");
	        System.out.println("<head>");
	        System.out.println("  <link rel='stylesheet' type='text/css' href='styles.css'>");
	        System.out.println("</head>");

	        // Inline Styles
	        System.out.println("\nInline Styles:");
	        System.out.println("<p style='color: green; font-weight: bold;'>This is a styled paragraph.</p>");

	        // CSS Comments
	        System.out.println("\nCSS Comments:");
	        System.out.println("/* This is a CSS comment */");

	        System.out.println("\nCSS allows you to control the layout and appearance of HTML elements, enhancing the visual presentation of web pages.");
	        System.out.println("You completed 1st Stage of CSS");
	        complete = complete + "c";
	        System.out.println("If You want to continue enter 2");
	        choice = sc.nextInt();

	   
		}
		if(choice==2) {
			System.out.println("Intermediate CSS involves more advanced styling techniques, layout control, and responsiveness.");

	        // Box Model
	        System.out.println("\nBox Model:");
	        System.out.println("The CSS box model consists of the content, padding, border, and margin of an element.");

	        // Flexbox
	        System.out.println("\nFlexbox:");
	        System.out.println("Flexbox is a one-dimensional layout method for laying out items in rows or columns.");

	        // Example Flexbox Styles
	        System.out.println("\nExample Flexbox Styles:");
	        System.out.println(".container {");
	        System.out.println("  display: flex;");
	        System.out.println("  justify-content: space-between;");
	        System.out.println("}");

	        System.out.println(".item {");
	        System.out.println("  flex-grow: 1;");
	        System.out.println("}");

	        // Grid Layout
	        System.out.println("\nGrid Layout:");
	        System.out.println("CSS Grid Layout is a two-dimensional layout system for the web, allowing you to create complex grid-based layouts.");

	        // Example Grid Styles
	        System.out.println("\nExample Grid Styles:");
	        System.out.println(".container {");
	        System.out.println("  display: grid;");
	        System.out.println("  grid-template-columns: 1fr 2fr 1fr;");
	        System.out.println("  grid-template-rows: auto;");
	        System.out.println("}");

	        // Media Queries
	        System.out.println("\nMedia Queries:");
	        System.out.println("Media queries allow you to apply different styles based on the characteristics of the device or viewport.");

	        // Example Media Query
	        System.out.println("\nExample Media Query:");
	        System.out.println("@media screen and (max-width: 600px) {");
	        System.out.println("  /* Styles for small screens */");
	        System.out.println("}");

	        // Transitions and Animations
	        System.out.println("\nTransitions and Animations:");
	        System.out.println("CSS transitions and animations allow you to create smooth and dynamic effects.");

	        // Example Transition
	        System.out.println("\nExample Transition:");
	        System.out.println(".box {");
	        System.out.println("  transition: width 0.3s ease-in-out;");
	        System.out.println("}");

	        // Example Animation
	        System.out.println("\nExample Animation:");
	        System.out.println("@keyframes slide-in {");
	        System.out.println("  from { transform: translateX(-100%); }");
	        System.out.println("  to { transform: translateX(0); }");
	        System.out.println("}");

	        System.out.println("\nIntermediate CSS involves mastering layout techniques, responsive design, and creating dynamic user experiences.");
	        System.out.println("You completed 2st Stage of CSS");
	        complete = complete + "o";
	        System.out.println("If You want to continue enter 3");
	        choice = sc.nextInt();
	  
		}
		if(choice==3) {
			 System.out.println("Advanced CSS involves mastering complex layout strategies, advanced selectors, and using preprocessors and postprocessors.");

		        // CSS Variables
		        System.out.println("\nCSS Variables:");
		        System.out.println("CSS Variables allow you to define reusable values throughout your stylesheet.");

		        // Example CSS Variables
		        System.out.println("\nExample CSS Variables:");
		        System.out.println(":root {");
		        System.out.println("  --main-color: #3498db;");
		        System.out.println("}");

		        System.out.println(".element {");
		        System.out.println("  color: var(--main-color);");
		        System.out.println("}");

		        // Advanced Selectors
		        System.out.println("\nAdvanced Selectors:");
		        System.out.println("CSS supports a variety of selectors, including attribute selectors, pseudo-classes, and combinators.");

		        // Example Advanced Selectors
		        System.out.println("\nExample Advanced Selectors:");
		        System.out.println("input[type='text']:focus {");
		        System.out.println("  border: 2px solid #27ae60;");
		        System.out.println("}");

		        // CSS Grid Layout Techniques
		        System.out.println("\nCSS Grid Layout Techniques:");
		        System.out.println("Advanced grid layout techniques involve creating complex layouts with precise control over rows and columns.");

		        // Example Grid Layout
		        System.out.println("\nExample Grid Layout:");
		        System.out.println(".container {");
		        System.out.println("  display: grid;");
		        System.out.println("  grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));");
		        System.out.println("  gap: 20px;");
		        System.out.println("}");

		        // CSS Transforms and Transitions
		        System.out.println("\nCSS Transforms and Transitions:");
		        System.out.println("Transforms allow you to modify the appearance and position of elements, while transitions create smooth animations.");

		        // Example Transform and Transition
		        System.out.println("\nExample Transform and Transition:");
		        System.out.println(".box {");
		        System.out.println("  transform: rotate(45deg);");
		        System.out.println("  transition: transform 0.3s ease-in-out;");
		        System.out.println("}");

		        // CSS Preprocessors (e.g., Sass)
		        System.out.println("\nCSS Preprocessors (e.g., Sass):");
		        System.out.println("CSS preprocessors enhance the capabilities of CSS by introducing features like variables, nesting, and mixins.");

		        // Example Sass Syntax
		        System.out.println("\nExample Sass Syntax:");
		        System.out.println("$main-color: #3498db;");
		        System.out.println(".element {");
		        System.out.println("  color: $main-color;");
		        System.out.println("}");

		        // Postprocessors (e.g., Autoprefixer)
		        System.out.println("\nPostprocessors (e.g., Autoprefixer):");
		        System.out.println("Postprocessors automatically add vendor prefixes to CSS properties to ensure compatibility with different browsers.");

		        System.out.println("\nAdvanced CSS involves leveraging the full power of the language to create sophisticated and efficient stylesheets.");
		        System.out.println("You completed 3st Stage of CSS");
		        complete = complete + "m";
		        System.out.println("If You want to continue enter 4");
		        choice = sc.nextInt();
		   
		}
		if(choice==4) {
			 System.out.println("Expert-level CSS involves mastering advanced layout, architecture, performance optimization, and CSS-in-JS techniques.");

		        // Critical CSS
		        System.out.println("\nCritical CSS:");
		        System.out.println("Critical CSS is a technique where you identify and inline the minimal CSS required to render above-the-fold content for faster page loading.");

		        // CSS-in-JS
		        System.out.println("\nCSS-in-JS:");
		        System.out.println("CSS-in-JS is an approach where CSS styles are written using JavaScript, allowing for dynamic styling and better component encapsulation.");

		        // Example Styled-Components Syntax (CSS-in-JS)
		        System.out.println("\nExample Styled-Components Syntax (CSS-in-JS):");
		        System.out.println("import styled from 'styled-components';");
		        System.out.println("const StyledButton = styled.button`");
		        System.out.println("  color: white;");
		        System.out.println("  background-color: #3498db;");
		        System.out.println("`;");
		        
		        // CSS Architecture (e.g., BEM, SMACSS)
		        System.out.println("\nCSS Architecture (e.g., BEM, SMACSS):");
		        System.out.println("Using methodologies like BEM (Block Element Modifier) or SMACSS (Scalable and Modular Architecture for CSS) for scalable and maintainable CSS code.");

		        // Example BEM Syntax
		        System.out.println("\nExample BEM Syntax:");
		        System.out.println(".block {");
		        System.out.println("  /* Block styles */");
		        System.out.println("}");
		        System.out.println(".block__element {");
		        System.out.println("  /* Element styles */");
		        System.out.println("}");
		        System.out.println(".block__element--modifier {");
		        System.out.println("  /* Modifier styles */");
		        System.out.println("}");

		        // CSS Variables for Theming
		        System.out.println("\nCSS Variables for Theming:");
		        System.out.println("Using CSS variables to create themable designs and allow easy customization.");

		        // Example CSS Variables for Theming
		        System.out.println("\nExample CSS Variables for Theming:");
		        System.out.println(":root {");
		        System.out.println("  --primary-color: #3498db;");
		        System.out.println("}");
		        System.out.println(".element {");
		        System.out.println("  color: var(--primary-color);");
		        System.out.println("}");

		        // GPU Acceleration and Hardware Accelerated CSS
		        System.out.println("\nGPU Acceleration and Hardware Accelerated CSS:");
		        System.out.println("Leveraging GPU acceleration for smoother animations and transitions.");

		        // Example GPU Accelerated CSS
		        System.out.println("\nExample GPU Accelerated CSS:");
		        System.out.println(".element {");
		        System.out.println("  transform: translateZ(0); /* Trigger GPU acceleration */");
		        System.out.println("}");

		        System.out.println("\nExpert-level CSS involves optimizing for performance, creating maintainable architectures, and staying updated on the latest industry best practices.");
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
		        	System.out.println("To Get certificate comlete Basic CSS");
		        	e=1;
		        }
		        if(o==0) {
		        	System.out.println("To Get certificate comlete Intermediate CSS");
		        	e=1;
		        }
		        if(m==0) {
		        	System.out.println("To Get certificate comlete Advanced CSS");
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
		    	            	
		    	            	
		    	        		String updateProductQuery = "UPDATE validity SET css = ? WHERE v_Email = ?";
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
