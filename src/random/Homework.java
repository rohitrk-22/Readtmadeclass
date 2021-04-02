package random;
import java.util.Random;
public class Homework 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int res1 = r.nextInt(100);
		int res2 = r.nextInt(100);
		System.out.println("1st Random Number is :" + res1);
		System.out.println("2nd Random Number is :" + res2);

		int res = checkNum(res1, res2);
		identify(res);
	}
	static int checkNum(int number1, int number2) 
	{
		int largerNum;
		if (number1 > number2) 
		{
			largerNum = number1;
			System.out.println(number1 + " is larger than " + number2);
		} 
		else 
		{
			largerNum = number2;
			System.out.println(number2 + " is larger than " + number1);
		}		
		return largerNum;
	}

	static void identify(int number1) 
	{
		if (number1 % 2 == 0) 
		{
			System.out.println(number1 + " Is EVEN ");
		} 
		else 
		{
			System.out.println(number1 + " Is ODD");
		}
	}
}
