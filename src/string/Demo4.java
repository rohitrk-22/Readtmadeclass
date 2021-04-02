package string;
public class Demo4 {

	public static void main(String[] args)
	{
		String s1 ="Engineering";
		
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.startsWith("Eng"));
		System.out.println(s1.endsWith("ing"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		System.out.println(s1.replace("Eng", "Bin"));
		System.out.println(s1.replaceAll("e", "b"));
		System.out.println(s1.replaceFirst("e", "b"));
		System.out.println(s1);
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,8));
		System.out.println(s1.subSequence(0, 4));
		System.out.println(s1.contains("ing"));
		System.out.println(s1.indexOf('r'));
		System.out.println(s1.lastIndexOf('g'));
		System.out.println(s1.charAt(4));
		System.out.println(s1.intern());
		
		String s2 =" Student";
		
		System.out.println(s1.concat(s2));
		System.out.println(s2.equals(s1));
		
		String s3 =" student";
		
		System.out.println(s2.equalsIgnoreCase(s3));
		
		int a =223344;
		int b = 556677;
		
		String s4 = String.valueOf(a);
		String s5 = String.valueOf(b);
		System.out.println(s4+s5);
		
		System.out.println(s5.length());
		
		int digits= String.valueOf(b).length();
		System.out.println(digits);
		
		String s6 ="   Pune   ";
		
		System.out.println(s6);
		
		System.out.println(s6.trim());
		
		String s7= "hey-hi-Bye";
		
		for (String info : s7.split("-"))
		{
			System.out.println(info);
		}
		System.out.println();
		
		String s8 ="ClassMate";
		char i[]= s8.toCharArray();
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		
		System.out.println(s1.codePointAt(1));
		System.out.println(s1.codePointBefore(3));
		System.out.println(s1.codePointCount(3, 5));
		System.out.println(s3.compareTo(s2));
		System.out.println(s3.getBytes());
		System.out.println(s3.getClass());
		System.out.println(s3.offsetByCodePoints(1, 2));
	}
}
