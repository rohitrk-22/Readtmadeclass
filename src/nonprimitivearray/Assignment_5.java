package nonprimitivearray;

import java.util.Scanner;

public class Assignment_5 
{
	public static void main(String[] args) 
	{
		System.out.println("----------way-1------------");
		
		int arr1[][][];
		arr1= new int[3][3][3];
		
		arr1[0][0][0]=10;
		arr1[0][1][2]=30;
		arr1[0][2][0]=40;
		arr1[0][2][2]=50;
		
		arr1[1][0][0]=60;
		arr1[1][1][1]=70;
		
		arr1[2][0][0]=80;
		arr1[2][2][0]=90;
		arr1[2][2][1]=99;
		
		
		for(int planeIndex = 0; planeIndex< arr1.length; planeIndex++)
		{
			for(int rowIndex = 0; rowIndex< arr1[planeIndex].length; rowIndex++)
			{
				for(int columnIndex = 0; columnIndex< arr1[planeIndex][rowIndex].length; columnIndex++)
				{
					System.out.print(arr1[planeIndex][rowIndex][columnIndex]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("----------way-2------------"); 	
		
		double d1 [][][]=new double[3][3][4];
		
		d1[0][0][0]=3.3;
		d1[1][0][0]=4.0;
		d1[2][0][0]=5.5;
		
		for(int planeIndex = 0; planeIndex< d1.length; planeIndex++)
		{
			for(int rowIndex = 0; rowIndex< d1[planeIndex].length; rowIndex++)
			{
				for(int columnIndex = 0; columnIndex< d1[planeIndex][rowIndex].length; columnIndex++)
				{
					System.out.print(d1[planeIndex][rowIndex][columnIndex]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		System.out.println("----------way-3------------");
		
		char c1[][][]= 
			{
					{
						{'A','B',' ','D','E'},
						{'A','B',' ','D','E'},
					},
					{
						{'A','B',' ','D','E'},
						{'A','B',' ','D','E'},
					}
			};
		
		for(int planeIndex = 0; planeIndex< c1.length; planeIndex++)
		{
			for(int rowIndex = 0; rowIndex< c1[planeIndex].length; rowIndex++)
			{
				for(int columnIndex = 0; columnIndex< c1[planeIndex][rowIndex].length; columnIndex++)
				{
					System.out.print(c1[planeIndex][rowIndex][columnIndex]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
			
		System.out.println("----------Using Scanner------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Plane size");
		
		int planesize = scan.nextInt();
		
		System.out.println("Enter row size");
		
		int rowsize = scan.nextInt();
		
		System.out.println("Enter column size");
		
		int columnsize = scan.nextInt();
		
		int s1[][][]=new int[planesize][rowsize][columnsize];
		
		for(int planeIndex1 = 0; planeIndex1< s1.length; planeIndex1++)
		{
			System.out.println("selecting plain"+ planeIndex1);
			for(int rowIndex = 0; rowIndex< s1[planeIndex1].length; rowIndex++)
			{
				System.out.println("Enter row "+ rowIndex+" elements:");
				for(int columnIndex = 0; columnIndex< s1[planeIndex1][rowIndex].length; columnIndex++)
				{
					s1[planeIndex1][rowIndex][columnIndex]=scan.nextInt();
				}
				System.out.println();
			}
			System.out.println();
		}
		
		for(int planeIndex1 = 0; planeIndex1< s1.length; planeIndex1++)
		{
			for(int rowIndex = 0; rowIndex< s1[planeIndex1].length; rowIndex++)
			{
				for(int columnIndex = 0; columnIndex< s1[planeIndex1][rowIndex].length; columnIndex++)
				{
					System.out.print(s1[planeIndex1][rowIndex][columnIndex]+" ");
				}
				System.out.println();
			}
			System.out.println();		
		
		}
		scan.close();
		}
	}

