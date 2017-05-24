public class ClubBouncer {
	public static void main( String[] args ) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "f";
		
		if ( onGuestList || age >= 21 || (gender.equals("f") && allure >= 8 ) ) {
			System.out.println("You are allowed to enter the club." );
			}
		else {
			System.out.println( "You are not allowed to enter the club." );
			}
		}
	}
	
	//it doesn't compile because an else statement is only allowed after an if statement
	//adding the extra pritln() would be fine if not followed by an else statement.