//Write a program to accept value from the user
import java.util.*;
class accept_value
{
	public static void main(String args[])
	{
		
		int num1,num2,res;
		System.out.println("Enter First Number");
	Scanner sc=new Scanner(System.in); // class_name object_name=new Constructor
		num1=sc.nextInt();
		System.out.println("Enter Second Number");
		num2=sc.nextInt();

		res=num1+num2;
		System.out.println("The add is ="+res);


	}
}



