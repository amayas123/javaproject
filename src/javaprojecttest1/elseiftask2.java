package javaprojecttest1;

import java.util.Scanner;

public class elseiftask2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		if(mark>=91&& mark<=100)
		{
		System.out.println("A+"); 
		}
		else if(mark>=90&& mark<=81)
		{
	System.out.println("A");
		}
		else if(mark>=80&& mark<=71)
		{
			System.out.println("B+");
		}
		else if(mark>=70&& mark<=61)
		{
			System.out.println("B");
		}
		else if(mark>=60&& mark<=51)
		{
			System.out.println("C+");
		}
		else if(mark>=50&& mark<=41)
		{
			System.out.println("C");
		}
		else if(mark>=40&& mark<=31)
		{
			System.out.println("D+");
		}
		else if(mark>=30&& mark<=21)
		{
			System.out.println("D");
		}
		else if(mark>=20&& mark<=11)
		{ 
			System.out.println("E");
		}
		else
		{
			System.out.println("invalid");
		}
		}
		
		
		// TODO Auto-generated method stub

	}


