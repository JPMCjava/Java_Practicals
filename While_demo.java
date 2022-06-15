package Loops;

import java.util.Scanner;

public class While_demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Min :");
		min=sc.nextInt();
		System.out.println("Enter Max:");
		max=sc.nextInt();
	/*	for(i=min;i<=max;i++)
		{
			System.out.println(i);
		}
*/
		while(min<=max)
		{
			System.out.println(min);
			min++;
		}
	}

}
