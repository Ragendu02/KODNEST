package com.kodnest.patternsinjava;

public class pattern23 {

public static void main(String[]args)
{
	for(int i=1;i<=5;i++)
	{
	for(int k=1;k<=5;k++)
	{
	System.out.print(" ");
	}
	for(int j=5;j>=i;j--)
	{
	System.out.print("*");
	}
	System.out.println();
	}
	for(int i=2;i<=5;i++)
	{
	for(int k=1;k<=5;k++)
	{
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
}}