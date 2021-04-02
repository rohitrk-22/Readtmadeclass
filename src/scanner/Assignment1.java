package scanner;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first value :");
		int a = scan.nextInt();
		System.out.println("You Entered a: "+a);
		
		System.out.println("Enter second value :");
		int b = scan.nextInt();
		System.out.println("You Entered b: "+b);
		
		System.out.println("a+b = " +(a+b));
		System.out.println("a-b = " +(a-b));
		System.out.println("a*b = " +(a*b));
		System.out.println("a/b = " +(a/b));
			
		scan.close();
	}
}
