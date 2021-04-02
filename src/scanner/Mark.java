package scanner;

import java.util.Scanner;

public class Mark 
{
	public static void main(String[] args) 
	{
		int s1,s2,s3,s4,s5,outoff;
		double per;
		
		Scanner s = new Scanner(System.in);
		
		s1=s.nextInt();
		s2=s.nextInt();
		s3=s.nextInt();
		s4=s.nextInt();
		s5=s.nextInt();
		
		outoff=s.nextInt();
		
		per=(s1+s2+s3+s4+s5)/(outoff*5);
		
		System.out.println(per);
		
		s.close();
		
	}

	
}
