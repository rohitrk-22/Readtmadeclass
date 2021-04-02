package array;

import java.util.Random;

public class ASSI4 
{
	
	public static void main(String[] args) {
		int array[] = new int[10]; 
		
		Random r1 = new Random ();
		
		//10-Random Numbers
		
		for (int number = 0;number <=9; number++)
		{
			int randomNumber = r1.nextInt(50);
			System.out.println(number+ " : " +randomNumber);		
			array[number] = randomNumber;		 
		}
		System.out.println("--------------------------");		
		Print.printArray(array, 10);
	}
	
}


class Print
{
	
	static void printArray(int[] a, int aLength)
	{
		for(int i = 0; i < aLength; i++)
		{
			System.out.println(i +" : "+ a[i]);
		}
	}
}