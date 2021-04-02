package nonprimitivearray;
import java.util.Scanner;

public class Test_Showroom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Showroom m[] = new Showroom[5];

		System.out.println("Enter Company Name:");
		String name = scan.next();
		System.out.println("Enter Price:");
		double price = scan.nextDouble();
		m[0] = new Showroom(name, price);

		System.out.println("Enter Company Name:");
		name = scan.next();
		System.out.println("Enter Price:");
		price = scan.nextDouble();
		m[2] = new Showroom(name, price);

		System.out.println("Enter Company Name:");
		name = scan.next();
		System.out.println("Enter Price:");
		price = scan.nextDouble();
		m[4] = new Showroom(name, price);

		System.out.println("------------------------------------");
		for (int i = 0; i < m.length; i++) 
		{
			System.out.println(i +". "+m[i]);
		}
		
		System.out.println("------------------------------------");
		
		for (int i = 0; i < m.length; i++) 
		{
			if (m[i] != null) 
			{
				System.out.println(i +". "+m[i]);
			}
		}
		scan.close();
	}
}
