
public class Sample1 {
	public static void main(String[] args) {
		
		char arr1[][] = {
				
				{'a','b','a'},
				{'c','c','b','z'},
				{'b','s','v'}
		};
		
		
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr1[i].length; j++)
			{
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println();
		}
	}

}
