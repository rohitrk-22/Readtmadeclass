package nonprimitivearray;

 class Student
	{
		String name;
		int yop;
		double per;
		char grade;
		
		Student (String a,int b,double c,char d)
		{
			name = a;
			yop=b;
			per=c;
			grade=d;
		}
	}
public class Test_Assignment_8 
{
	public static void main(String[] args)
	{
		Student s[] = new Student[5]; 
		
		s[0] = new Student("Ram",2020,99,'A');
		s[1] = new Student("Ramesh",2019,98,'B');
		s[2] = new Student("Rahul",2018,97,'C');
		s[3] = new Student("Rohan",2017,96,'D');
		s[4] = new Student("Rakesh",2016,95,'E');
		
		for(int i = 0;i<s.length;i++)
		{
			System.out.println(s[i].name+" "+s[i].yop+" "+s[i].per+" "+" "+s[i].grade);
		}
	}
}
