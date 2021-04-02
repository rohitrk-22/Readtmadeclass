package scanner;

import java.util.*;

public class Assignmnet2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first value :");
		int a = scan.nextInt();
		System.out.println("You Entered : " + a);

		System.out.println("Enter second value :");
		int b = scan.nextInt();
		System.out.println("You Entered : " + b);

		Random r = new Random();
		int res1 = r.nextInt(a);
		int res2 = r.nextInt(b);

		System.out.println("1st Random number is:" + res1);
		System.out.println("2nd Random number is:" + res2);

		Sample.add(res1, res2);

		Sample S1 = new Sample();
		int sub = S1.sub(res1, res2);
		System.out.println("Subtration is:" + sub);

		scan.close();
	}
}

class Sample {
	static void add(int res1, int res2) {
		System.out.println("Addition is " + (res1 + res2));
	}

	int sub(int res1, int res2) {

		return (res1 - res2);
	}
}