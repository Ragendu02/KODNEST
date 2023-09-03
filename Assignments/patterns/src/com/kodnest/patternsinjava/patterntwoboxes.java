package com.kodnest.patternsinjava;

public class patterntwoboxes {
	// TODO Auto-generated method stub
	public static void main(String[]args)
	{
			int n=11;
			 for(int i=0;i<=n;i++)
			 {for(int j=0;j<=n;j++)
			 {if((i==0 && j<=n/2)||(j==0 && i<=n/2)||(i==n/2 && j<=n/2)||(j==n/2 && i<=n/2)||(i==6 &&j>=n/2)||(i>=6 && j==n)||j==5 ||i==n &&j>=n/2)
			 {System.out.print("*");
			 }else {
				 System.out.print(" ");
			 }
			 }System.out.println();
				}

			
	}
}
