package Functions;

import java.util.Scanner;

public class Fun_demo3 {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		accept();
	}

	public static void accept()
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add(num1,num2);
		mul(num1,num2);
		//result=div(num1,num2);
		System.out.println("The value of division is ="+div(num1,num2));
	}
	public static void add(int n1,int num2)
	{
		System.out.println("The add is ="+ (n1+num2));
	}
	public static void mul(int num1,int num2)
	{
		System.out.println("The mul is ="+ (num1*num2));
	}
	public static int div(int num1,int num2)
	{
		int res;
		 res=num1/num2;
		 
		 return res;
	}
}
