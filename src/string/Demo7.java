package string;

public class Demo7 {

	public static void main(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("Engineering");
		
		System.out.println(sb1);
		
		sb1.reverse();
		
		System.out.println(sb1);
		
		for(int position = sb1.length()-1;position>=0;position--)
		{
			System.out.print(sb1.charAt(position));
		}
		System.out.println();
	}
		
}
