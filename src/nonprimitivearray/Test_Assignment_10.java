package nonprimitivearray;
class City
{
	String name;
	int rto;
	
	City (String x,int y)
	{
		name = x;
		rto=y;
	}
	 public String toString()
	 {
		 return name+" "+rto;
	 }
}
public class Test_Assignment_10 
{
	public static void main(String[] args)
	{
		City c[]= new City[5];
		c[0]= new City ("Mumbai",01);
		c[2]= new City ("Pune",12);
		c[4]= new City ("Nagpur",31);
		
		for ( int i= 0;i<c.length;i++)
		{
			if(c[i]!=null)
			{
				System.out.println(c[i].name+" "+"MH"+c[i].rto);
			}
		}
	}
}
