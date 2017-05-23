import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, interest;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Hello. What is your name?" );
		name = keyboard.next();
		
		System.out.println( "Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old!" );
		System.out.println( "How much do you weigh, " + name + "?" );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "!! Better keep that quiet!!" );
		System.out.println( "What is your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.println( "Hopefully that is " + income + " per hour " );
		System.out.println( " and not per year!" );
		
		System.out.println( "What are your interests, " + name + "?" );
		interest = keyboard.next();
		System.out.println( "You're into " + interest + "??!?!? You're a total freak, " + name + "!!" );
		
		System.out.print( "Well, thanks for answering my rude questions, ");
		System.out.println( name + "." );
		}
	}
	
	/*
	1) It does not blow up because a double is still an integer - the opposite WOULD
	make it blow up!
	2) It does not blow up, because numbers can be strings - but strings can't be integers!
	3) question 1 can be blown up with mathematical operations
        question 2 can be blown up with a double or a string
        question 3 can be blown up with a string
        */
        
        
    