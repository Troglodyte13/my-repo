import java.util.Scanner;

/*
	The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
	human body fat in populations.  You will need to prompt the user for their weight and height. 
	It is computed by taking the individual's weight (mass) in kilograms and dividing it by the 
	square of their height in meters.
	
	Use the 4 categories below to to determine the output.
	
	BMI				Category
	-----------------------------------
	< 18.5			Under Weight
	18.5 - 24.9		Normal
	25.0 - 29.9		Overweight
	30.0 or more	Obese
	-----------------------------------
 */

public class BMICalculator {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	//TODO Prompt for person's height in meters
	//TODO Prompt for person's weight in kilograms
	//TODO Calculate the person's BMI
	//TODO Determine which category the person belongs to
	//TODO Print out BMI and Category

	
	System.out.print("Enter your height in meters (1 in = 2.54cm): ");
	double height =  Double.parseDouble(scanner.nextLine());
	
	System.out.print("Enter your weight in kilograms (1 lb = 0.45359237 kg): ");
	double weight = Double.parseDouble(scanner.nextLine());
	
	double heightBMI = (height * height);

	double BMI = Math.round(weight / heightBMI * 10) / 10.0;
	
	if (BMI <= 18.5) {
		System.out.println("Your BMI is " + BMI + ". You are Under Weight.");
	}
	else if (BMI >= 18.6 && BMI <= 24.9) {
		System.out.println("Your BMI is " + BMI + ". You are Normal.");
	}
	else if (BMI >= 25.0 && BMI <= 29.8) {
		System.out.println("Your BMI is " + BMI + ". You are Overweight.");
	}
	else if (BMI >= 29.9) {
		System.out.println("Your BMI is " + BMI + ". You are Obese.");
	}
	
	scanner.close();
	
	}
}
