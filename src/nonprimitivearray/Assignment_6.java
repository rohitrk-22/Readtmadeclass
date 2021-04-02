package nonprimitivearray;

public class Assignment_6 
{
		public static void main(String[] args) {
			
			char arr1[];
			arr1 = new char[4];
			
			arr1[0]= 'A';
			arr1[1]= 'B';
			arr1[2]= 'C';
			arr1[3]= 'D';

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

