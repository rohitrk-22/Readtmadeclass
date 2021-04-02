package nonprimitivearray;
import java.util.Scanner;

public class ASSIGNMENT_1
{
	public static void main(String[] args) 
	{
		System.out.println("----------way-1------------");
		
		int arr1[];
		arr1= new int[3];
		
		arr1[0]=10;
		arr1[2]=20;
		
		for(int value : arr1)
		{
			System.out.println(value);
		}
		
		System.out.println("----------way-2------------"); 	
		
		double d1 []=new double[5];
		
		d1[0]=3.3;
		d1[2]=4.0;
		d1[4]=5.5;
		
		for(int indexNumber=0;indexNumber<d1.length;indexNumber++)
		{
			System.out.println(d1[indexNumber]);
		}
		System.out.println("----------way-3------------");
		
		char c1[]= {'A','B',' ','D','E'};
		
		for( int indexNumber=0;indexNumber<c1.length;indexNumber++)
		{
			System.out.println(c1[indexNumber]);
		}
		System.out.println("----------Using Scanner------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter array index size");
		
		int indexsize = scan.nextInt();
		
		int s1[]=new int[indexsize];
		
		System.out.println("Enter "+indexsize+" elements");
		
		for(int indexNumber = 0; indexNumber<s1.length;indexNumber++)
		{
			s1[indexNumber]=scan.nextInt();
		}
		
		for (int value: s1)
		{
			System.out.println(value);
		}
		scan.close();
	}
}