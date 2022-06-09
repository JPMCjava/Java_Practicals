import java.util.*;
class accept_str
{
	public static void main(String args[])
	{
		
		String name;
		char gen;
		String comm;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statment:");
		comm=sc.nextLine();
		System.out.println("Enter Your Name:");
		name=sc.next();
		System.out.println("Enter Your gender");
		gen=sc.next().charAt(0);
		
		System.out.println("This is my name ="+name);
		System.out.println("This is my Gender ="+gen);
		
		System.out.println("The line is  ="+comm);
	}
}