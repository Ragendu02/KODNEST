package com.kodnest.patternsinjava;

public class pattern36 {
	public static void main(String[] args) {
	int n=10;
	 for(int i=0;i<=n;i++)
	 {for(int j=0;j<=n;j++)
	 {if(i==0||i==n||j==0||j==0||j==n||j==n-i-1||j==i)
	 {System.out.print("*");
	 }else {
		 System.out.print(" ");
	 }
	 }System.out.println();
		}

	}
}
