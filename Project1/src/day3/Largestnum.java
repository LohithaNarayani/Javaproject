package day3;

import java.util.Scanner;

public class Largestnum {
	
	int a[];
	int greater()
	{
		int n,max;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no.of elements in an array");
		n=scan.nextInt();
		int a[] =new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		max=a[0];
		
	for(int i=0;i<n;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	return max;
	}
	
	public static void main(String args[])
	{
		Largestnum obj=new Largestnum();
		System.out.println("Largest number is:" + obj.greater());
	}

}
