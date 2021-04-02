package scanner;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter first value :");
		int a = scan.nextInt();
		System.out.println("You Entered : "+a);
		
		System.out.println("Enter second value :");
		int b = scan.nextInt();
		System.out.println("You Entered : "+b);
		test(a,b);
		scan.close();
	}
	static void test(int number1,int number2)
	{
		if (number1>number2)
		{
			System.out.println(number1 + " is greater than "+ number2);
		}
		else
		{
			System.out.println(number2 + " is greater than "+ number1);
		}
	}

}
