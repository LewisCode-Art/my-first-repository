package org.amalitech.codingTest13_1_2020;

import java.util.*;


public class Saturday {
	public static void main(String[] args) {
		
		System.out.println("Enter \"Start\" to start the program");
		
		keep_running(code_trigger_starter_str);
		
	}// end of main method
	
	static boolean program_Running_bool = false;
	static String code_trigger_starter_str = "start";
	static String code_trigger_ender_str = "end";

	public static void keep_running(String code_trigger_stater_str) {
		Scanner userInput = new Scanner(System.in);
		String tell_user_input = userInput.nextLine();
		
		
		if (tell_user_input.equalsIgnoreCase(code_trigger_starter_str)) {
			
			program_Running_bool=true;
		
		while (program_Running_bool==true) {
			
			String user_entry = userInput.nextLine();		
			System.out.printf("You entered: %s \n", user_entry);
			
		} // end of while loop
		
		
		
		
		//System.out.printf("You entered: %s ", tell_user_input);
		}// end of if condition
		else if(tell_user_input.equalsIgnoreCase(code_trigger_ender_str)) {
			System.out.println("the program has ended");
			System.exit(0);
			
		}// end of else if
		
		else {
			System.out.println("Please restart" + " and enter start to run code");
			keep_running(code_trigger_stater_str);
			
		} // end of else
	}// end of the kep_running method

}// end of class
