package nonprimitivearray;
import java.util.Scanner;

public class Assignment_4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter row index size");
		int rowsize = scan.nextInt();
		
		System.out.println("Enter column index size");
		int columnsize = scan.nextInt();
		  
		int s1[][]= new int [rowsize][columnsize];
		
		System.out.println("Enter elements:");
		for(int ri = 0;ri<s1.length;ri++)
		{
			for(int ci = 0;ci<s1[ri].length;ci++)
			{
				s1[ri][ci] = scan.nextInt();
			}
		}
		for(int ri = 0;ri<s1.length;ri++)
		{
			for(int ci = 0;ci<s1[ri].length;ci++)
			{
				System.out.print(s1[ri][ci]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
