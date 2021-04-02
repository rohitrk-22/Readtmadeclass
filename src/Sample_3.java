public class Sample_3 
{
	public static void main(String[] args) 
	{
		char arr1 [][][]=new char [3][3][4];
		
		
		arr1[0][0][0]='A';
		arr1[0][1][1]='B';		
		arr1[0][1][2]='C';
		arr1[0][2][3]='D';
		
		arr1[1][0][3]='E';
		arr1[1][1][1]='G';		
		arr1[1][1][2]='F';
		arr1[1][2][0]='H';
		
		arr1[2][0][0]='I';
		arr1[2][1][1]='J';		
		arr1[2][1][2]='K';
		arr1[2][2][3]='L';
		
		
		
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