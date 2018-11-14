package interactorPackage;

/**
 * @author Bob van der Putten
 * @version 1
 */
public class MainClass
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Make our input / output object
		ConsoleIO io = new ConsoleIO();
		
		// Tell it to put something on the screen:
		io.writeOutput("Click below this message, type something and press ENTER");
		
		// Tell it to read something from the 
		// console (the program waits for this to happen):
		String input = io.readInput();
		
		// etc. etc. Here you can see that the value was correctly 
		// stored in our local 'input' variable.
		io.writeOutput("You typed: " + input);
		
		input = io.readInput();
		io.writeOutput("And after that you typed: " + input);
	}

}
