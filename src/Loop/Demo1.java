package Loop;

public class Demo1
{
	public static void main(String[] args) {
		
		int arr1[];
		arr1 = new int[6];
		
		arr1[0]= 2;
		arr1[2]= 4;
		arr1[3]= 3;
		arr1[5]= 5;

		System.out.println("------------------------------------------------------");
		
		System.out.println("Using: do-while loop Acending order");
		
		int indexNumber  = 0;
		
		do {
			System.out.println(arr1[indexNumber]);
			indexNumber++;
		}
		while(indexNumber < arr1.length);
		
		
		System.out.println("Using: do-while loop De-cending order");
		
		 indexNumber  = arr1.length-1;
		
		do {
			System.out.println(arr1[indexNumber]);
			indexNumber--;
		}
		while(indexNumber >= 0);
		
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Using: while loop Acending order");
	
		indexNumber = 0;
		while(indexNumber < arr1.length)
		{
			System.out.println(arr1[indexNumber]);
			indexNumber++;
		}
		
		
		System.out.println("Using: while loop De-cending order");
		
		indexNumber = arr1.length-1;
		
		while(indexNumber >= 0)
		{
			System.out.println(arr1[indexNumber]);
			indexNumber--;
		}
		System.out.println("--------------------------------------------------------");
		
		
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
		 
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("Using: for loop Acending order");
		for(indexNumber = 0; indexNumber < arr1.length; indexNumber++)
		{
			System.out.println(arr1[indexNumber]);
		}
		
		System.out.println("Using: for loop De-cending order");
		for(indexNumber = arr1.length-1; indexNumber >=0; indexNumber--)
		{
			System.out.println(arr1[indexNumber]);
		}
	}
 
  
}
