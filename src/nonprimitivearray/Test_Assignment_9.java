package nonprimitivearray;

 class Laptop 
{
	String company;
	double price;
	
	Laptop (String x,double y)
	{
		company = x;
		price=y;
	}
	 public String toString()
	 {
		 return company+" "+price;
	 }
}
public class Test_Assignment_9
{
	public static void main(String[] args)
	{
		Laptop l[]= new Laptop[3];
		l[0]=new Laptop("HP",95000);
		l[1]=new Laptop("DELL",85000);
		l[2]=new Laptop("LENOVO",75000);
		
		for(int i= 0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}
	}
}