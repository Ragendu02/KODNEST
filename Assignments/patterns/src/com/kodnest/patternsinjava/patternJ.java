package com.kodnest.patternsinjava;

public class patternJ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		 for(int i=0;i<=n;i++)
		 {for(int j=0;j<=n;j++)
		 {if(i==0||j==n/2||i==n && j<n/2)
		 {System.out.print("*");
		 }else {
			 System.out.print(" ");
		 }
		 }System.out.println();
			}

		
}
}
