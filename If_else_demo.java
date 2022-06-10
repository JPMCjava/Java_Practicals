//WAP to accept a no from user and check it is even or odd
import java.util.*;
class If_else_demo
{
	public static void main(String args[])
	{
		int num,res;
		Scanner sc=new Scanner(System.in); // Accept Input
		System.out.println("Enter your number:");
		num=sc.nextInt();
		if(num%2==0 && num!=0)
		{
			System.out.println("It is Even Number"+num);
		}
		
		else if( num==0)
		{
			System.out.println("It is neither even Nor Odd");
		}
		else
		{
			System.out.println("It is Odd Number"+num);
		}
	}
}