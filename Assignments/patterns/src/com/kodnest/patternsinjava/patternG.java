package com.kodnest.patternsinjava;

public class patternG {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		 for(int i=0;i<=n;i++)
		 {for(int j=0;j<=n;j++)
		 {if(i==0||j==0||i==n||i==n/2+1 && j>=n/2||i>=n/2+1 && j==n)
		 {System.out.print("*");
		 }else {
			 System.out.print(" ");
		 }
		 }System.out.println();
			}

		
}
}
