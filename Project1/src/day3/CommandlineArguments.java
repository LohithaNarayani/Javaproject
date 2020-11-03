package day3;

public class CommandlineArguments {
	
	int eno; 
	String ename;
	
	void accept(int en,String enam)
	{
		this.eno=en;
		this.ename=enam;
	}
	
	void display()
	{
		System.out.println("employeeno" + eno + "employeename" + ename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommandlineArguments cd=new CommandlineArguments();
		cd.accept(Integer.parseInt(args[0]),args[1]);
		
		cd.display();
	}

}
