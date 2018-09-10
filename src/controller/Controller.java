package controller;

import java.util.Scanner;

public class Controller
{
	public void start()
	{
		System.out.println("Words get printed below");
		
		questions();
		
		moreInput();
		
		public boolean validInt(String sample)
		{
			boolean isValid = false;
			
			try
			{
				Integer.parseInt(sample);
				isValid = true;
			}

		catch(NumberFormatException error)
		{
			System.out.println("You need to type in a number");
		}
		
		return isValid;
	}
	
		public boolean validDouble(String example)
		{
			boolean isValid = false; 
			
			try
			{
				Double.parseDouble(example);
				isValid = true;
			}
			catch(NumberFormatException oops)
			{
				System.out.println("Only floating point values are accepted/ numbers");
			}
			
			return true;
			
		}
		
		
	private void questions()
	{
		System.out.println("What is your favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		System.out.println(answer); 
		
		System.out.println("How are you today?");
		answer = inputScanner.next();
		
		System.out.println(answer);
		
		System.out.println("What are you doing right now?");
		answer = inputScanner.next();
		
		System.out.println(answer);
		
		
		System.out.println("Do you like pizza??");
		answer = inputScanner.next();
		
		System.out.println(answer);
		
//		inputScanner.close();
		
	}
		private void moreInput()
	{
		Scanner textScanner; //This is a declaration of a scanner variable.
		
		textScanner = new Scanner(System.in); //Initialize of the textScanner variable
		
		System.out.println("Type in your favorite number");
		
		int userNumber = textScanner.nextInt();
		
		System.out.println("Your favorite nubmer is: " + userNumber);
		
		System.out.println("Type in some more information");
		
		textScanner.nextLine();
		
		textScanner.close();
	}
}

