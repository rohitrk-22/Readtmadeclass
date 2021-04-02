package Loop;

public class Demo3 
{
	public static void main(String[] args)
	{
		
		int arr1[];
		arr1 = new int[6];
		
		arr1[0]= 2;
		arr1[2]= 4;
		arr1[3]= 3;
		arr1[5]= 5;
		
		System.out.println("Using: for each loop Acending order");
		
		String str = "";
		for(int value : arr1)
		{
			str = str + value;
			System.out.println(value);
		}
		System.out.println("Using: for each loop Decending order");
		
		StringBuilder sb1 = new StringBuilder(str);
		sb1.reverse();
		String st1=sb1.toString();
		
		 char data[]= st1.toCharArray();
		 for(char value : data )
			{
				System.out.println( value);
			}
	}
}