package day3;

import java.util.Scanner;

public class RandomNum {
	char arr[];
	char result;
	char temp[];
	int n,j;
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		 n=sc.nextInt();
		 arr=new char[n];
		 RandomNum rn=new RandomNum();
		 System.out.println("Before Sorting and removing the duplicates");
		for(int i=0;i<n;i++)
		{
			arr[i]=(char)(sc.nextInt(26)+65);
			
			System.out.println(" ");
			System.out.println(" " +arr[i]+" ");
		}
	}
		void sort() {
			System.out.println("after sorting");
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]<arr[j]) {
						result=arr[i];
						arr[i]=arr[j];
						arr[j]=result;
					}
				}
				System.out.println(" " +arr[i]+ " ");
			}
		}
			void duplicate() {
				temp=new char[n];
				j=0;
				for(int i=0;i<n-1;i++) {
					if(arr[i]!=arr[i+1]) {
						temp[j++]=arr[i];
					}
				}	
				temp[j++]=arr[n-1];
			}
			void print()
			{
				System.out.println("After removing duplicates");
				for(int i=0;i<j;i++) {
					System.out.println(" "+temp[i]);
				}
			}
			public static void main(String[] args) {
				RandomNum rn1=new RandomNum();
				rn1.accept();
				rn1.sort();
				rn1.duplicate();
				rn1.print();
			}

}
