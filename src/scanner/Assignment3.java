package scanner;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Value:");
		int a = scan.nextInt();
		 
		System.out.println("You Entered:"+a);
		 
		 test(a);
		 scan.close();
	}
	static void test ( int number)
	{
		if (number % 2 == 0)
		{
			System.out.println(number+ " is Even");
		}
		else
		{
			System.out.println(number+ " is Odd");
		}
	}
}

