package array;

import java.util.Random;

public class Assignment5 {

	public static void main(String[] args) {
		int array[] = new int[10];

		Random r1 = new Random();

		System.out.println("10- Random Numbers");
		for (int number = 0; number <= 9; number++) {
			int randomNumber = r1.nextInt(50);
			System.out.println(number + " : " + randomNumber);
			array[number] = randomNumber;
		}
		System.out.println("------------------------------------");

		System.out.println("Array elements");
		for (int indexNumber = 0; indexNumber <= 9; indexNumber++) {
			System.out.println(indexNumber + ":" + array[indexNumber]);
		}

		System.out.println("------------------------------------");
		for (int indexNumber = 0; indexNumber <= 9; indexNumber++) {
			testEvenOdd(array[indexNumber]);
		}
		System.out.println("----------------------------");

	}

	static void testEvenOdd(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is Even");
		} else {
			System.out.println(number + " is Odd");
		}
	}
}
