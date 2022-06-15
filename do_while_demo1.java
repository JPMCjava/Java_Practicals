package Loops;

import java.util.Scanner;

public class do_while_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		do
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		while(num>0);
		System.out.println("The sum of digit is ="+sum);
	}

}
