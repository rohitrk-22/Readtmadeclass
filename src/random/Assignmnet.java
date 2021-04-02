package random;

import java.util.Random;

public class Assignmnet {

	public static void main(String[] args) {
		Random r = new Random();
		int res1 = r.nextInt(100);
		int res2 = r.nextInt(100);
		System.out.println("1st Random Number is :" + res1);
		System.out.println("2st Random Number is :" + res2);
		test(res1);
		test(res2);

	}

	static void test(int number) {
		if (number % 2 == 0) {

			System.out.println(number + " Is EVEN ");
		} else {

			System.out.println(number + " Is ODD ");
		}
	}

}
