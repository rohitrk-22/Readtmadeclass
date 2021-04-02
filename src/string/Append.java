package string;

public class Append {

	public static void main(String[] args) 
	{
		String s1 = "Core";
		System.out.println(s1);
		s1=s1.concat("Java");
		System.out.println(s1);
		
		StringBuilder sb1 = new StringBuilder("Class");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		sb1.append("mate");
		System.out.println(sb1);
		
		sb1.insert(0, "10th");
		
		System.out.println(sb1);
		
		System.out.println(sb1.charAt(0));
		
		sb1.delete(0, 4);
		
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		
		sb1.deleteCharAt(1);
		System.out.println(sb1);System.out.println(sb1.insert(1,"l"));
				
		sb1.setCharAt(0, 'G');
		
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		
		sb1.setLength(5);
		System.out.println(sb1);
		
		sb1.trimToSize();
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Glass");
		System.out.println(sb1.equals(sb2));
		
		 sb2 = sb1.reverse();
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.reverse());
		
		sb1.replace(3, 5, "m");
		System.out.println(sb1);
		 
		
		

	}

}
