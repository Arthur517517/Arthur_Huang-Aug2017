 

import java.io.FileNotFoundException;
import java.util.Scanner;
// Update this file with your own code.

import java.io.FileNotFoundException;
import java.util.Scanner;
// Update this file with your own code.

public class TextExcel
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
	    String userInput = "";
	    boolean done = false;
	    Spreadsheet a = new Spreadsheet();
	    System.out.println("Enter: ");
	    while(!done) {
	    	userInput = input.nextLine();
	    	if(userInput.equals("quit")) {
	    		done = true;
	    	}else {
	    		System.out.println(a.processCommand(userInput));
	    	}

	    }
	   
	}
}