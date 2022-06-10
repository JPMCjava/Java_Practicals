import java.util.*;
class bitwise_opt
{
	public static void main(String args[])
	{
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		res=num1&num2;
		System.out.println("The bitwise End is ="+res);

		res=num1|num2;
		System.out.println("The bitwise OR is ="+res);

		res=num1^num2;
		System.out.println("The bitwise XOR is ="+res);
	}
}