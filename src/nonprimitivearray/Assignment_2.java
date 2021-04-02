package nonprimitivearray;

public class Assignment_2 {

	public static void main(String[] args) 
	{
		System.out.println("--------way 1---------");

		int a1[][];

		a1 = new int[2][3];

		a1[0][0] = 2;
		a1[0][1] = 4;
		a1[0][2] = 6;

		a1[1][0] = 8;
		a1[1][2] = 10;

		for (int rowIndex = 0; rowIndex < a1.length; rowIndex++) 
		{
			for (int columnIndex = 0; columnIndex < a1[rowIndex].length; columnIndex++) {
				System.out.print(a1[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}
		System.out.println("--------way 2---------");

		double d1[][] = new double[3][2];

		d1[0][0] = 2.1;
		d1[0][1] = 4.1;

		d1[1][0] = 8.1;
		d1[1][1] = 1.0;

		d1[2][0] = 6.1;
		d1[2][1] = 10.1;

		for (int ri = 0; ri < d1.length; ri++) 
		{
			for (int ci = 0; ci < d1[ri].length; ci++) 
			{
				System.out.print(d1[ri][ci] + " ");
			}
			System.out.println();
		}
	}
}
