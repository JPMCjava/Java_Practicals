import java.util.*;
class switch_demo
{
	public static void main(String args[])
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice \n1:Pin change \n2:Withdraw \n3:Balance Check \n4:ABC");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Operation of Pin change");
			break;
			case 2:
				System.out.println("Operation of Withdraw Money");
			break;
			case 3:
				System.out.println("Operation of Check the balance");
			break;
			case 4:
				System.out.println("Operation of Extra ");
			break;
			default:
				System.out.println("Invalid Choice");
			break;
		}
	}
}




