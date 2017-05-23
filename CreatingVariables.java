public class CreatingVariables {
	public static void main( String [] args) {
		int x, y, age, weight;
		double seconds, e, checking, exactWeight;
		String firstName, lastName, title, heavy;
		
		x = 10;
		y = 400;
		age = 39;
		weight = 165;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		exactWeight = 165.598;
		
		firstName = "Charlie";
		lastName = "Actor";
		title = "Mr.";
		heavy = "you're fat.";
		
		System.out.println( "the variable x contains " + x);
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + " " + lastName );
		System.out.println( "My name is " + title + " " + firstName + " " + lastName + " and my weight is " +
		weight + " although technically it is " + exactWeight + " which leads me to believe that " + heavy );
		}
	}