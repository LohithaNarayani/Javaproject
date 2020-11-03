package day3;

import java.util.Scanner;

public class Student {
	int studid;
	String studname;
	
	void accept()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Student details");
		studid=scan.nextInt();
		studname=scan.next();
	}
	void display(Student stu)
	{
		System.out.println("StudentID:" +studid+ "Studentname:" +studname);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu[]=new Student[5];
		
		for(int i=0;i<stu.length;i++) {
			stu[i]=new Student();
			stu[i].accept();
			stu[i].display(stu[i]);
			}
		}
	}




