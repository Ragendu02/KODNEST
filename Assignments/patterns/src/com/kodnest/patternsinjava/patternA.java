package com.kodnest.patternsinjava;

public class patternA {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			int n=11;
			 for(int i=0;i<=n;i++)
			 {for(int j=0;j<=n;j++)
			 {if (((j== 0 || j == n)&&i!=0|| (i== 0 || i== n/2) && (j> 0 && j< n)))
			 {System.out.print("*");
			 }else {
				 System.out.print(" ");
			 }
			 }System.out.println();
				}

			
	}
}
