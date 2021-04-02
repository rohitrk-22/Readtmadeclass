package string;

public class Demo1 {

	public static void main(String[] args)
	{
		//without instantiation string object will store in Constant pool Area

		String s1 = "Mumbai";
		String s2 = "Goa";
		String s3 = "Goa";
		
		//with instantiation string object will store in Non-Constant pool Area	
		
		String s4 = new String("Banglore");
		
		String s5 = new String("Pune");
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		
	}

}


