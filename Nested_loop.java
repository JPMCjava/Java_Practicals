package Loops;
public class Nested_loop {
	public static void main(String[] args) 
	{
		int i,j,k,n;
		// TODO Auto-generated method stub
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==1||i==4)
				{
					if(j==5)
					{
					System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
					
				}
				else if(i==2 ||i==3)
				{
					if(j==1||j==5)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if(j==1)
					{
						System.out.print("*");
					}
				}
			}
            System.out.println();
        }
	
	}
}
/*
*   i=1  j=1
**  i=2  j=2
***  i=3  j=3
****  i=4  j=4
*****  i=5;j=5
*/