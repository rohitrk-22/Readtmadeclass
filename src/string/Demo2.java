package string;

public class Demo2 {

	public static void main(String[] args)
	{
		System.out.println("------String----------");
		String s1 = "Mumbai";
		String s2 = "Goa";
		s2 = "Pune";
	
		System.out.println(s1);
		System.out.println(s2);
			
		System.out.println("------StringBuilder----------");
		
		StringBuilder sb1 = new StringBuilder("Pune ");
		sb1= new StringBuilder("Mumbai");
		
		System.out.println(sb1);
		
		System.out.println("------StringBuffer----------");
		
		StringBuffer sb2 = new StringBuffer("Nagpur ");
		sb2= new StringBuffer("Delhi");
		System.out.println(sb2);
	}

}
