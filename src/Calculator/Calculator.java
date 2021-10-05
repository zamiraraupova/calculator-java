package Calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Build a calculator with options of: addition, subtraction, multiplication, division and exit
		
//		1. Write different methods for each module (add, subtract, multiply, and divide).
//
//		2. Use switch/case to call the particular method.
//
//		3. Take input inside the methods to perform the related operation.
//
//		4. Return the answer and display it inside the main method.
//
//		5. Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user
//		
		//start scanner 
		Scanner scanner = new Scanner(System.in);
		//reads the user input
		System.out.println("Enter operations('+' , '-' , '*' , '/' , 'exit'): ");
		//prints the operation of user input
		String operation = scanner.nextLine();
		
		
		// switch/cases for an operation
	    switch (operation) {
	    case "+" :
	    	addition();
	    	break;
	    case "-" :
	    	subtraction();
	    	break;
	    case "*" :
	    	multiplication();
	    	break;	
	    case "/" :
	    	division();
	    	break;
	    case "exit":
	    	exit();
	    	break;	
	    default:
	    	break;
	    }
	}  
	
	//add function 
	public static void addition() {
		// start a scanner
	    	Scanner scanner = new Scanner(System.in);
	    //ask for input
		    System.out.println("Enter the first number: ");		
		//read an input	
		    float num1f = scanner.nextInt();
	    // if number different from 1-5   
			if (num1f < 1 || num1f > 5) {
				System.out.print("Invalid Entry");
			}
			else {
				System.out.println("Enter the second number: ");	
		    float num2f = scanner.nextInt();
			
		    	if( num2f < 1 || num2f > 5) {
		    		System.out.print("Invalid Entry");
		    	}
		    	else {
		    		 float sum = num1f + num2f;
		             System.out.println(sum);
		    	}
		   
			}
	    }
	
	public static void subtraction() {
    	Scanner scanner = new Scanner(System.in);
    
	    System.out.println("Enter the first number: ");		
		float num1f = scanner.nextInt();
	    
		if (num1f < 1 || num1f > 5) {
			System.out.print("Invalid Entry");
		}
		else {
			System.out.println("Enter the second number: ");	
	    float num2f = scanner.nextInt();
		
	    	if( num2f < 1 || num2f > 5) {
	    		System.out.print("Invalid Entry");
	    	}
	    	else {
	    		float sub = num1f - num2f;
			    System.out.println(sub);
	    	}
	   
		}
    }
	
	public static void multiplication() {
    	Scanner scanner = new Scanner(System.in);
    
	    System.out.println("Enter the first number: ");		
		float num1f = scanner.nextInt();
	    
		if (num1f < 1 || num1f > 5) {
			System.out.print("Invalid Entry");
		}
		else {
			System.out.println("Enter the second number: ");	
	    float num2f = scanner.nextInt();
		
	    	if( num2f < 1 || num2f > 5) {
	    		System.out.print("Invalid Entry");
	    	}
	    	else {
	    		float mult = num1f * num2f;
			    System.out.println(mult);
	    	}
	   
		}
    }
	
	public static void division() {
    	Scanner scanner = new Scanner(System.in);
    
	    System.out.println("Enter the first number: ");		
		float num1f = scanner.nextInt();
	    
		if (num1f < 1 || num1f > 5) {
			System.out.print("Invalid Entry");
		}
		else {
			System.out.println("Enter the second number: ");	
	    float num2f = scanner.nextInt();
		
	    	if( num2f < 1 || num2f > 5) {
	    		System.out.print("Invalid Entry");
	    	}
	    	else {
	    		float div = num1f / num2f;
			    System.out.println(div);
	    	}
	   
		}
    }
	  
	    public static void exit() {
	    	//start a scanner
	    	Scanner scanner = new Scanner(System.in);
	    	//print a question
		    System.out.println("Would you exit? Y / N ");	
		    // reads an input
		    String response = scanner.next();
		  // if input is "N" --> run the main 
		    if(response.equals("N")) {
		    	main(null);
		    }
		    // otherwise closes the program "bye"
		    else { 
		    	System.out.println("Bye!");
		    }
		    
	    }
}
