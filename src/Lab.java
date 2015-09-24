import java.util.Scanner;

public class Lab
{
	public static void main(String[] args)
	{
		Scanner  input=new Scanner(System.in);
		
		int number1, number2;
			
			System.out.print("Enter first integer: ");
			number1=input.nextInt();
			
			System.out.print("Enter second integer ");
			number2=input.nextInt();
			
			System.out.printf("Hello, you enter %d and %d", number1, number2);
	}
}