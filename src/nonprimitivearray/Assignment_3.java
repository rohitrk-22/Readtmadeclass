package nonprimitivearray;

public class Assignment_3 
{
	public static void main(String[] args) 
	{
		 char c1[][]= {
				       {'a',' ','c'},
				       {' ','d',' '},
				       {'e',' ','f'}
		 	};
		 
		 for(int ri=0;ri<c1.length;ri++)
		 {
			 for(int ci = 0;ci<c1[ri].length;ci++)
			 {
				 System.out.print(c1[ri][ci]+" ");
			 }
			 System.out.println();
		 }
	}
}
