package Loops;

import java.util.Scanner;

public class do_while_demo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice,ch1,total=0;
		char ans;
		String pro="";
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\tXYZ HOTEL");
		do
		{
			System.out.println("Menu");
			System.out.println("1:Starters");
			System.out.println("2:Main Course");
			System.out.println("3:Desert");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Starters");
				System.out.println("1:S1  200Rs.");
				System.out.println("2:S1 100Rs.");
				System.out.println("3:S1");
				System.out.println("4:S1");
				ch1=sc.nextInt();
					switch(ch1)
					{
					case 1:
						total+=200;//total=total+200
						pro+="Item1";
						break;
					case 2: 
						total+=100;
						pro+="\nItem2";
						break;
					}
					
				
				
				break;
			case 2:
				System.out.println("Starters");
				System.out.println("1:S1   \t\t\t 100Rs.");
				System.out.println("2:S1");
				System.out.println("3:S1");
				System.out.println("4:S1");
				ch1=sc.nextInt();
				break;
			case 3:
				System.out.println("Starters");
				System.out.println("1:S1");
				System.out.println("2:S1");
				System.out.println("3:S1");
				System.out.println("4:S1");
				ch1=sc.nextInt();
				break;
			}
			
			System.out.println("Do you want to add any more item: Y/N");
			ans=sc.next().charAt(0);
		}
		while(ans=='y'||ans=='Y');
		
		System.out.println("Thanks For Coming :)");
		System.out.println("The bill amount is ="+total+"\nItems="+pro);

	}

}
