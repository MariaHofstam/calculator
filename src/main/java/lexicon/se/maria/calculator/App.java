package lexicon.se.maria.calculator;

import java.util.Scanner;

/**********************************
 * Basic Console-based calculator *
 **********************************/

public class App 
{
	private static Scanner scanner = new Scanner(System.in);
	
	private static String getStringFromUser() {					//method getStringFromUser	
		String text = scanner.nextLine();
		return text;}
	
	public static boolean playing(String answer) {				//method Y/N
		String upperCaseString = answer.toUpperCase();
		switch(upperCaseString) {
		case "Y":
			return true;
		default:
			return false;
		}
	}	
	
	private static int getIntFromUser() {						//method getIntFromUser
	
		boolean valid = false;
		int number = 0;
		while(!valid) {
			try {
				number = Integer.parseInt(getStringFromUser());
				valid = true;				
			}catch(NumberFormatException e) {
				System.out.println("Input was not a number");
			}
		}
		return number;
	}
	
	public static int calculate(int n1, int n2, String operator) {		//method - calculate
    	switch(operator) {
    	case "+":
    		return n1 + n2;
    	case "-":
    		return n1 - n2;
    	case "*":
    		return n1 * n2;
    	case "/":
    		if(n1 == 0 || n2 == 0 ) {
    		  return 0;
    		}
    		return n1 / n2;
    	default:
    		return 0;
    	}
    }
	
	public static void main (String [] args) {
		int num1, num2, result; 
		String calc, operator;
		boolean valid;
	
		/*********************
		 * Welcome - message *
		 *********************/	
		
		System.out.println("Welcome! Here you can calculate 2 integer numbers");
		System.out.println("Do you want to calculate? Y/N ");
		calc = getStringFromUser();
		valid = playing(calc);
		
		/*********************
		 * Calculate Y/N *
		 *********************/	
		
		while (valid) {								// Player wants to calculate
		
			System.out.println("Enter an integer number");				// Fist number"
			num1 = getIntFromUser();
			
			System.out.println("Enter an operator, i.e +, -, * or /");  //operator
			operator = getStringFromUser();
			
			System.out.println("Enter an integer number");				// Second number
			num2 = getIntFromUser();
			
			result = calculate(num1,num2,operator);
			System.out.println("The result is: " + result);
			valid = false;
		
		}											// Player do NOT want to calculate
		System.out.println("Welcome back!");
	
	}
	
}
