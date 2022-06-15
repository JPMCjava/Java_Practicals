package Loops;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		for(i=10;i>=5;i--)
		{
			for(k=9;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=10;j<=2*i-2;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
