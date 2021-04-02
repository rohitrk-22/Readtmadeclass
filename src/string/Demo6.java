package string;

public class Demo6 
{
 public static void main(String[] args) 
{
	String s1 = "Laptop";
	System.out.println(s1);
	
	System.out.println("--------------------------------");
	//way1
	
	for(int position = s1.length()-1;position>=0;position--)
	{
		System.out.print(s1.charAt(position));
	}
	System.out.println();
	
	System.out.println("--------------------------------");
	
	
	//way2
	
	char data[]= s1.toCharArray();
	
	for(int indexNumber = data.length-1;indexNumber>=0;indexNumber--)
	{
		System.out.print(data[indexNumber]);
	}
	
	}
}
