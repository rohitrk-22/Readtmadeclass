package nonprimitivearray;

public class Showroom 
{
	String model;
	double price;
	
	Showroom (String x,double y)
	{
		model = x;
		price=y;
	}
	 public String toString()
	 {
		 return model+" "+price;
	 }
}

