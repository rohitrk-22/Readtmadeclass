package nonprimitivearray;

 class Showroom_1
{
		String model;
		double price;
		
		Showroom_1 (String x,double y)
		{
			model = x;
			price=y;
		}
	}
public class Test_Assignment_7 
{
	public static void main(String[] args)
	{
		Showroom_1 s1[] = new Showroom_1[3];
		s1[0] = new Showroom_1("Verna", 1000000);
		s1[1] = new Showroom_1("Nexon", 1500000);
		s1[2] = new Showroom_1("Swift", 950000);
		
		for(int i = 0;i<s1.length;i++)
		{
			System.out.println(s1[i].model+" "+s1[i].price);
		}
	}
}