import java.util.*;
class Profit_Loss
{
	public static void main(String args[])
	{
		int cp,sp,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter SP numbers:");
		sp=sc.nextInt();
		System.out.println("Enter CP numbers:");
		cp=sc.nextInt();
		res=sp-cp ;
		System.out.println("The profit ="+res);
	}
}




