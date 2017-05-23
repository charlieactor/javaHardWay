import java.util.Scanner;

public class ForgetfulMachine {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "What city is the capital of France?" );
		keyboard.next();
		
		System.out.println( "What is 6 multiplied by 7?" );
		keyboard.nextInt();
		
		System.out.println( "Enter a number between 0.0 and 1.0." );
		keyboard.nextDouble();
		
		System.out.println( "Is there anything else you would like to say?" );
		keyboard.next();
		}
	}
	
	// the second question blows up when you use decimals
	/*the third question blew up initially because I had written nextInt instead of next
	 double, and integers cannot contain decimals! */
	 
	 