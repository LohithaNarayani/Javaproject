package day3;

public class Employee{
	int eno;
	String ename;
	Employee()
	{
		eno=1;
		ename="Lohitha";
	}
	void display1()
	{
		System.out.println( "Employeeno" + eno + "Employeename" +ename);
	}
	
	 Employee(int en, String ena)
	{
		eno=en;
		ename=ena;
	}
	 void display2()
	 {
		 System.out.println( "Employeeno" + eno + "Employeename" +ename);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee(12,"Vishnu");
		e1.display1();
		e2.display2();
	}

}
