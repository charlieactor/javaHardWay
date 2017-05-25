import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String password, passwordEntry;
		
		password = "foodaddy";
		pin = 12345;
		
		System.out.println( "Welcome to the bank of java." );
		System.out.print("Enter your password: ");
		passwordEntry = keyboard.next();
		
		while (! passwordEntry.equals("foodaddy")) {
			System.out.println("\nIncorrect password, try again.");
			System.out.print("Enter your password: ");
			passwordEntry = keyboard.next();
			}
				
		System.out.print("Enter your PIN: ");
		entry = keyboard.nextInt();
		
		while ( entry != pin) {
			System.out.println( "\nIncorrect PIN, try again.");
			System.out.println( "Enter your PIN: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPIN accepted. Your account balance is $425.17");
		}
	}