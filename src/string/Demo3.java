package string;

 
	public class Demo3
	{
		public static void main(String[] args)
		{
			
			//without instantiation string object will store in Constant pool Area

			String s1 = "Mumbai";
			String s2 = "Mumbai";
			 
			//with instantiation string object will store in Non-Constant pool Area	
			
			String s3 = new String("Banglore");
			
			String s4 = new String("Pune");
			
			StringBuilder sb1 = new StringBuilder("Pune");
			
			// Comparing address of string object
			
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			System.out.println(s1==s4);
			System.out.println(s3==s4);
			
			// Comparing Content of string object
			
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println(s1.equals(s4));
			System.out.println(s3.equals(s4));
			
			System.out.println(sb1.toString().equals(s4));
			
		}
	}
