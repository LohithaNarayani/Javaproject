package day3;

import java.util.Scanner;

public class Returntype {
	
	double d;
	Integer meth1(double d)
	{
		
		int myint;
		myint=(int)d;
		Integer I=Integer.valueOf(myint);
		return I;
	}
	float meth2(Integer I)
	{
		int k=I.intValue();
		float f=k;
		return f;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returntype ob=new Returntype();
		Integer I=ob.meth1(2.0);
		System.out.println(I);
		float f1=ob.meth2(I);
		System.out.println(f1);

	}

}
