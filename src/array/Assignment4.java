package array;

import java.util.Arrays;
import java.util.Random;

public class Assignment4 
{
	public static void main (String [] args )
	{
		int array[]= new int [10];
		
		Random r1 = new Random ();
		
//		System.out.println("10- Random Numbers");
		for (int number = 0;number <=9; number++)
		{
			int randomNumber = r1.nextInt(50);
//			System.out.println(number+ " : " +randomNumber);		
			array[number] = randomNumber;		 
		}	
//		System.out.println("------------------------------------");
		
		System.out.println("Array Objects");
		for(int indexNumber= 0;indexNumber <=9; indexNumber++)
		{
			System.out.println(indexNumber+":"+array[indexNumber]);
		}
		System.out.println("----------------------------");
		Arrays.sort(array);
		System.out.println("Sorted Array Object in Ascending Order");
		for(int indexNumber= 0;indexNumber <=9; indexNumber++)
		{
			System.out.println(indexNumber+":"+array[indexNumber]);
		}
		System.out.println("--------------------------");
		System.out.println("Sorted Array Object in Descending Order");
		
		for(int indexNumber= 9;indexNumber >=0; indexNumber--)
		{
			System.out.println(indexNumber+":"+array[indexNumber]);
		}			
	}
}
