import java.util.Scanner;

public class AgeMessages {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		
		System.out.print( "How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println( "You are: " );
		if ( age < 13) {
			System.out.println( "\ttoo young to create a Facebook account." );
			}
		if ( age >= 13 ) {
			System.out.println( "\told enough to create a Facebook account :)" );
			}
		if ( age < 16 ) {
			System.out.println( "\ttoo young to get a driver's license." );
			}
		if ( age >= 16 ) {
			System.out.println( "\told enough to get a driver's license!" );
			}
		if ( age < 18) {
			System.out.println( "\ttoo young to get a tattoo." );
			}
		if ( age >= 18 ) {
			System.out.println( "\told enough to get hella ink bruh!!" );
			}
		if ( age<21 ) {
			System.out.println( "\ttoo young to drink alcohol." );
			}
		if ( age >= 21 ) {
			System.out.println( "\told enough to get smashed and wake up naked in a dumpster!" );
			}
		if ( age < 35 ) {
			System.out.println( "\ttoo young to run for President of the U.S.A." );
			System.out.println( "\t\t(How sad!)" );
			}
		if (age >= 35 ) {
			System.out.println( "\told enough to run for President and save us from the nightmare we're currently living!!" );
			}
		if (age < 65 ) {
			System.out.println( "\ttoo young to retire...now get back to work!!" );
			}
		if ( age >= 65 ) {
			System.out.println( "\told enough to retire, ya old coot!" );
			}
		}
	}
			