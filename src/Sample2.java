
public class Sample2 
{
	public static void main(String[] args) 
	{
		int arr1 [][][];
		
		arr1 = new int [3][3][3];
		
		
				
				
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
	}
}
