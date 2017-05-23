import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double feet, inches, pounds, height, kg, bmi;
		
		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches only): ");
		inches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: ");
		pounds = keyboard.nextDouble();
		
		height = (inches * .0254) + (feet * .3048);
		kg = (pounds * .453592);
		
		bmi = kg / (height*height);
		
		System.out.print( "Your BMI is " + bmi );
		}
	}
	