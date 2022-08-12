package Puzzels;

public class Star_pattern {

	public static void main(String[] args) {
		int space=3;
		int star=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		
			space--;
			star=star+2;
		}
		int sp=3;
		int st=1;
		for(int l=4;l>=1;l--)
		{
			for(int m=3;m>=sp;m--)
			{
				System.out.print(" ");
			}
			
			for( int n=5;n>=st;n--)
			{
				System.out.print("*");
			}
			System.out.println("");
			sp--;
			st=st+2;
			}
		}
	}
	

