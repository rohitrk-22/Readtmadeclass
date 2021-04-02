package nonprimitivearray;

import java.util.Arrays;

public class Assignment_11 
{
	public static void main (String [] args )
	{
		int array[]= new int [5];
		
		        array[0] =23;
		        array[1] =43;
				array[2] =11;
				array[3] =32;
				array[4] =10;
						
		System.out.println("Array Objects");
		for(int indexNumber= 0;indexNumber< array.length; indexNumber++)
		{
			System.out.println(indexNumber+":"+array[indexNumber]);
		}
		
		System.out.println("----------------------------");
		Arrays.sort(array);
		System.out.println("Sorted Array Object in Ascending Order");
		for(int indexNumber= 0;indexNumber<array.length; indexNumber++)
		{
			System.out.println(indexNumber+":"+array[indexNumber]);
		}
		System.out.println("--------------------------");
		System.out.println("Sorted Array Object in Descending Order");
		
		for(int indexNumber= array.length-1;indexNumber>=0; indexNumber--)
		{
			System.out.println(indexNumber+":"+array[indexNumber]);
		}	
	}
}
