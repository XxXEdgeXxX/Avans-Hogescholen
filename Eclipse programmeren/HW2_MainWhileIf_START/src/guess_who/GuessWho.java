package guess_who;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Always type your name here!
 * @version 1
 */
public class GuessWho
{
	/**
	 * our main method
	 * 
	 * @param args			arguments
	 */
	public static void main(String[] args)
	{
		// You may ignore the three lines of code below this one:
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			// Here you'll find some examples of how to do stuff. You can leave them in your program:
			// Putting text in the console:
			System.out.println("Welcome to 'Guess Who'! Let me guess your guy. Type 'yes' or 'no', followed by ENTER.");
			// Reading text from the console (click in the console and type one character, press enter):
			String s = br.readLine();
			// Putting text in the console, use '+' to concatenate Strings (stick them together):
			System.out.println("OK great! You typed: " + s + ". Now we can start for real!");
			
			////////////////// YOUR CODE - START ///////////////////////
			
			/////////////////// YOUR CODE - END ////////////////////////
			
		//You may ignore everything below this line
		}
		catch(Exception e)		
		{
			System.out.println("AII - Something went wrong: " + e.getMessage());
		}

	}
}
