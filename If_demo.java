//WAP to accept a no from the user and if no is positive than find oput the square.
import java.util.*;
class If_demo
{
	public static void main(String args[])
	{
		int num,res;
		Scanner sc=new Scanner(System.in); // Accept Input
		System.out.println("Enter your number:");
		num=sc.nextInt();
		if(num>0)
		{
			res=num*num;
			System.out.println("The square of the no is ="+res);
		}
	}
}