import java.util.Scanner;

public class Sample5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter plain size:");
		int plainSize = scan.nextInt();
		
		System.out.println("Enter row size:");
		int rowSize = scan.nextInt();
		
		System.out.println("Enter column size:");
		int columnSize = scan.nextInt();
		
		int arr1 [][][] = new int[plainSize][rowSize][columnSize];
		
		for (int pi = 0; pi < arr1.length; pi++)
		{
			System.out.println("Selecting plain "+pi);
			
			for (int ri = 0; ri < arr1[pi].length; ri++)
			{
				System.out.println("Enter row "+ri+" elements:");
				for (int ci = 0; ci < arr1 [pi] [ri].length; ci++)
				{
					arr1[pi][ri][ci] = scan.nextInt();
				}
				System.out.println();
			}
			System.out.println();
		}	
		System.out.println("3D Array elements are:");
		
		for (int pi = 0; pi < arr1.length; pi++)
		{
			for (int ri = 0; ri < arr1[pi].length; ri++)
			{
				for (int ci = 0; ci < arr1 [pi] [ri].length; ci++)
				{
					System.out.print(arr1[pi][ri][ci]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}	
		scan.close();
	}
}
