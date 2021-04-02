package string;
public class Sample1 
{
	public static void main(String[] args) 

{
	StringBuilder sb1 = new StringBuilder("Maharashtra");
	System.out.println("Capacity :"+sb1.capacity());
	System.out.println("Length :"+sb1.length());
	System.out.println("Append :"+sb1.append(" India"));
	System.out.println("CharAt :"+sb1.charAt(0));
	System.out.println("Char() :"+sb1.chars());
	System.out.println("codePointAt :"+sb1.codePointAt(2));
	System.out.println("codePointBefore :"+sb1.codePointBefore(2));
	System.out.println("codePointCount :"+sb1.codePointCount(1, 4));
	System.out.println("codePoint() :"+sb1.codePoints());
	System.out.println("Insert :"+sb1.insert(0,"State "));
	System.out.println("Reverse :"+sb1.reverse());
	System.out.println(sb1.reverse());
	System.out.println("Delete :"+sb1.delete(0, 5));
	System.out.println("DeleteCharAt :"+sb1.deleteCharAt(0));
	
	sb1.setCharAt(0, 'D');
	System.out.println("SerCharAt :"+sb1);
	
	sb1.setLength(4);
	System.out.println("setLength :"+sb1);
	
	System.out.println("Replace :"+sb1.replace(0, 1, "M"));
	
	sb1.trimToSize();
	System.out.println("trimTosize :"+sb1.capacity());
	
	StringBuilder sb2 = new StringBuilder("Maharashtra");
	System.out.println("substring :"+sb2.substring(4));
	System.out.println("substring :"+sb2.substring(4, 8));
	System.out.println("indexof :"+sb2.indexOf("a"));
	System.out.println("lastindexof :"+sb2.lastIndexOf("a"));
		
	System.out.println(sb1.equals(sb2));
	
	sb2= sb1.append("India");
	System.out.println(sb1.equals(sb2));
	
	System.out.println("getclass :"+sb1.getClass());
	
	char a [] =new char[6];
	sb1.getChars(0, 3, a, 2);
	
	for (int i=0;i<6;i++)
	{
		System.out.println(i+":"+a[i]);
	}
	
	sb1.ensureCapacity(88);
	System.out.println(sb1.capacity());
	

	

}
}