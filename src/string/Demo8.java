package string;

public class Demo8 {

	public static void main(String[] args) 
	{
		StringBuilder sb1 =new StringBuilder();
		System.out.println("Capacity:"+sb1.capacity());
		
		StringBuilder sb2 =new StringBuilder();
		System.out.println("Capacity:"+sb2.capacity());
		
		sb2.ensureCapacity(30);
		System.out.println("Capacity:"+sb2.capacity());
		
		StringBuilder sb3 =new StringBuilder();
		System.out.println("Capacity:"+sb3.capacity());
		
		sb3.ensureCapacity(58);
		System.out.println("Capacity:"+sb3.capacity());
	}

}
