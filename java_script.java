package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class java_script {
	Scanner sc=new Scanner(System.in);

	public void java_script() {
		// TODO Auto-generated method stub
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basic Java Script");
		System.out.println("Enter 2 for Intermediate Java Script");
		System.out.println("Enter 3 for Advanced Java Script");
		System.out.println("Enter 4 for Expert Java Script");
		int choice = sc.nextInt();
		String complete = null;
		if(choice==1) {
			System.out.println("JavaScript is a lightweight, interpreted programming language that enables interactive and dynamic content on web pages.");

	        // Key Concepts
	        System.out.println("\nKey Concepts:");
	        System.out.println("1. Variables: Used to store and manipulate data.");

	        System.out.println("2. Data Types: Include numbers, strings, booleans, objects, and more.");

	        System.out.println("3. Functions: Blocks of reusable code.");

	        System.out.println("4. Control Flow: Includes if statements, loops, and switch statements.");

	        // Basic Syntax
	        System.out.println("\nBasic Syntax:");
	        System.out.println("var greeting = 'Hello, World!';");
	        System.out.println("function sayHello() {");
	        System.out.println("  console.log(greeting);");
	        System.out.println("}");
	        System.out.println("sayHello();");

	        // Variables and Data Types
	        System.out.println("\nVariables and Data Types:");
	        System.out.println("var age = 25;");
	        System.out.println("var name = 'John';");
	        System.out.println("var isStudent = true;");

	        // Functions
	        System.out.println("\nFunctions:");
	        System.out.println("function addNumbers(num1, num2) {");
	        System.out.println("  return num1 + num2;");
	        System.out.println("}");
	        System.out.println("var sum = addNumbers(10, 20);");

	        // Arrays
	        System.out.println("\nArrays:");
	        System.out.println("var colors = ['red', 'green', 'blue'];");
	        System.out.println("var firstColor = colors[0];");

	        // Objects
	        System.out.println("\nObjects:");
	        System.out.println("var person = {");
	        System.out.println("  name: 'Alice',");
	        System.out.println("  age: 30,");
	        System.out.println("  isStudent: false");
	        System.out.println("};");
	        System.out.println("var personName = person.name;");

	        // Control Flow (if statement)
	        System.out.println("\nControl Flow (if statement):");
	        System.out.println("var temperature = 25;");
	        System.out.println("if (temperature > 20) {");
	        System.out.println("  console.log('It's a warm day!');");
	        System.out.println("} else {");
	        System.out.println("  console.log('It's a cool day.');");
	        System.out.println("}");

	        System.out.println("\nJavaScript is a versatile language used for both front-end and back-end development, enabling dynamic and interactive web applications.");
	        System.out.println("You completed 1st Stage of JAVA SCRIPT");
	        complete = complete + "c";
	        System.out.println("If You want to continue enter 2");
	        choice = sc.nextInt();
	   
		}
		if(choice==2) {
			System.out.println("Intermediate JavaScript involves advanced topics like closures, asynchronous programming, and working with the DOM.");

	        // Closures
	        System.out.println("\nClosures:");
	        System.out.println("Closures allow functions to retain access to variables from their containing scope even after the scope has finished execution.");

	        // Example Closure
	        System.out.println("\nExample Closure:");
	        System.out.println("function outerFunction() {");
	        System.out.println("  var outerVariable = 'I am from the outer function!';");
	        System.out.println("  function innerFunction() {");
	        System.out.println("    console.log(outerVariable);");
	        System.out.println("  }");
	        System.out.println("  return innerFunction;");
	        System.out.println("}");
	        System.out.println("var closureExample = outerFunction();");
	        System.out.println("closureExample();");

	        // Asynchronous Programming (Callbacks and Promises)
	        System.out.println("\nAsynchronous Programming (Callbacks and Promises):");
	        System.out.println("JavaScript handles asynchronous operations using callbacks and promises.");

	        // Example Promise
	        System.out.println("\nExample Promise:");
	        System.out.println("function fetchData() {");
	        System.out.println("  return new Promise((resolve, reject) => {");
	        System.out.println("    // Simulating an asynchronous operation");
	        System.out.println("    setTimeout(() => {");
	        System.out.println("      resolve('Data fetched successfully!');");
	        System.out.println("    }, 2000);");
	        System.out.println("  });");
	        System.out.println("}");
	        System.out.println("fetchData().then((data) => {");
	        System.out.println("  console.log(data);");
	        System.out.println("}).catch((error) => {");
	        System.out.println("  console.error(error);");
	        System.out.println("});");

	        // The Document Object Model (DOM)
	        System.out.println("\nThe Document Object Model (DOM):");
	        System.out.println("The DOM is a programming interface for web documents, allowing JavaScript to interact with HTML and CSS.");

	        // Example DOM Manipulation
	        System.out.println("\nExample DOM Manipulation:");
	        System.out.println("var element = document.getElementById('myElement');");
	        System.out.println("element.innerHTML = 'Updated content';");

	        // Event Handling
	        System.out.println("\nEvent Handling:");
	        System.out.println("Handling user interactions and browser events using event listeners.");

	        // Example Event Listener
	        System.out.println("\nExample Event Listener:");
	        System.out.println("var button = document.getElementById('myButton');");
	        System.out.println("button.addEventListener('click', function() {");
	        System.out.println("  console.log('Button clicked!');");
	        System.out.println("});");

	        System.out.println("\nIntermediate JavaScript involves mastering asynchronous programming, manipulating the DOM, and handling events for interactive web development.");
	        System.out.println("You completed 2st Stage of JAVA SCRIPT");
	        complete = complete + "o";
	        System.out.println("If You want to continue enter 3");
	        choice = sc.nextInt();
	   
		}
		if(choice==3) {
			System.out.println("Advanced JavaScript involves topics such as ES6 features, functional programming, and working with modern frameworks.");

	        // ES6 Features (Arrow Functions, Template Literals, Destructuring)
	        System.out.println("\nES6 Features:");
	        System.out.println("ES6 introduces several new features to enhance JavaScript syntax and functionality.");

	        // Example Arrow Function
	        System.out.println("\nExample Arrow Function:");
	        System.out.println("const add = (a, b) => a + b;");

	        // Example Template Literal
	        System.out.println("\nExample Template Literal:");
	        System.out.println("const name = 'John';");
	        System.out.println("const greeting = `Hello, ${name}!`;");

	        // Example Destructuring Assignment
	        System.out.println("\nExample Destructuring Assignment:");
	        System.out.println("const person = { name: 'Alice', age: 30 };");
	        System.out.println("const { name, age } = person;");

	        // Functional Programming (Higher-Order Functions, Map, Filter, Reduce)
	        System.out.println("\nFunctional Programming:");
	        System.out.println("Functional programming emphasizes the use of pure functions and immutability.");

	        // Example Higher-Order Function
	        System.out.println("\nExample Higher-Order Function:");
	        System.out.println("const multiplyBy = (factor) => (number) => number * factor;");
	        System.out.println("const double = multiplyBy(2);");

	        // Example Map Function
	        System.out.println("\nExample Map Function:");
	        System.out.println("const numbers = [1, 2, 3, 4];");
	        System.out.println("const doubledNumbers = numbers.map((num) => num * 2);");

	        // Example Filter Function
	        System.out.println("\nExample Filter Function:");
	        System.out.println("const evenNumbers = numbers.filter((num) => num % 2 === 0);");

	        // Example Reduce Function
	        System.out.println("\nExample Reduce Function:");
	        System.out.println("const sum = numbers.reduce((acc, num) => acc + num, 0);");

	        // Modern JavaScript Frameworks (React, Angular, Vue)
	        System.out.println("\nModern JavaScript Frameworks:");
	        System.out.println("Frameworks like React, Angular, and Vue enable building complex and scalable web applications.");

	        // Example React Component
	        System.out.println("\nExample React Component:");
	        System.out.println("import React from 'react';");
	        System.out.println("const MyComponent = () => <div>Hello, World!</div>;");

	        // Asynchronous JavaScript (Async/Await)
	        System.out.println("\nAsynchronous JavaScript (Async/Await):");
	        System.out.println("Async/await simplifies asynchronous code and improves readability.");

	        // Example Async/Await
	        System.out.println("\nExample Async/Await:");
	        System.out.println("async function fetchData() {");
	        System.out.println("  const response = await fetch('https://api.example.com/data');");
	        System.out.println("  const data = await response.json();");
	        System.out.println("  return data;");
	        System.out.println("}");

	        System.out.println("\nAdvanced JavaScript involves mastering modern language features, functional programming, and building applications with powerful frameworks.");
	        System.out.println("You completed 3st Stage of JAVA SCRIPT");
	        complete = complete + "m";
	        System.out.println("If You want to continue enter 4");
	        choice = sc.nextInt();
	   
		}
		if(choice==4) {
			System.out.println("Expert-level JavaScript involves advanced topics like design patterns, performance optimization, and full-stack development.");

	        // JavaScript Design Patterns (Singleton, Observer, Module)
	        System.out.println("\nJavaScript Design Patterns:");
	        System.out.println("Design patterns are reusable solutions to common problems in software design.");

	        // Example Singleton Pattern
	        System.out.println("\nExample Singleton Pattern:");
	        System.out.println("const Singleton = (() => {");
	        System.out.println("  let instance;");
	        System.out.println("  return {");
	        System.out.println("    getInstance: () => {");
	        System.out.println("      if (!instance) {");
	        System.out.println("        instance = new Object();");
	        System.out.println("      }");
	        System.out.println("      return instance;");
	        System.out.println("    }");
	        System.out.println("  };");
	        System.out.println("})();");

	        // Example Observer Pattern
	        System.out.println("\nExample Observer Pattern:");
	        System.out.println("class Subject {");
	        System.out.println("  constructor() {");
	        System.out.println("    this.observers = [];");
	        System.out.println("  }");
	        System.out.println("  addObserver(observer) {");
	        System.out.println("    this.observers.push(observer);");
	        System.out.println("  }");
	        System.out.println("  notify() {");
	        System.out.println("    this.observers.forEach(observer => observer.update());");
	        System.out.println("  }");
	        System.out.println("}");

	        // Example Module Pattern
	        System.out.println("\nExample Module Pattern:");
	        System.out.println("const myModule = (() => {");
	        System.out.println("  const privateVariable = 'I am private';");
	        System.out.println("  return {");
	        System.out.println("    publicMethod: () => {");
	        System.out.println("      console.log(privateVariable);");
	        System.out.println("    }");
	        System.out.println("  };");
	        System.out.println("})();");

	        // Performance Optimization
	        System.out.println("\nPerformance Optimization:");
	        System.out.println("Optimizing JavaScript code for better performance, including minification, lazy loading, and reducing render-blocking resources.");

	        // Full-Stack JavaScript (Node.js, Express, MongoDB)
	        System.out.println("\nFull-Stack JavaScript:");
	        System.out.println("Using JavaScript on both the client and server sides to build scalable and efficient web applications.");

	        // Example Node.js Server
	        System.out.println("\nExample Node.js Server:");
	        System.out.println("const express = require('express');");
	        System.out.println("const app = express();");
	        System.out.println("app.get('/', (req, res) => res.send('Hello, World!'));");
	        System.out.println("app.listen(3000, () => console.log('Server listening on port 3000'));");

	        System.out.println("\nExpert-level JavaScript involves applying advanced design patterns, optimizing performance, and building full-stack applications.");
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
	        	System.out.println("To Get certificate comlete Basic JAVA SCRIPT");
	        	e=1;
	        }
	        if(o==0) {
	        	System.out.println("To Get certificate comlete Intermediate JAVA SCRIPT");
	        	e=1;
	        }
	        if(m==0) {
	        	System.out.println("To Get certificate comlete Advanced JAVA SCRIPT");
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
	    	            	
	    	            	
	    	        		String updateProductQuery = "UPDATE validity SET java_script = ? WHERE v_Email = ?";
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
