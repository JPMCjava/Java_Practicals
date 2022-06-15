package Loops;

import java.util.Scanner;

public class fact_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("The factorial is ="+fact);

	}

}
