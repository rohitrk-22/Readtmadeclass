
public class Sample4 {

	public static void main(String[] args) {
		int arr1 [][][] = {
				// Plane 0
				{
					{8,0,0},
					{0,0,5},
					{4,0,3},
					{1,2,3}
				},
				// Plane 1
				{
					{0,0,6},
					{0,1,0},
					{5,0,0},
					{1,2,3}
				},
				// Plane 1
				{
					{1,0,4},
					{0,3,0},
					{1,2,0},
					{1,2,3}
				}
		};
		
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
