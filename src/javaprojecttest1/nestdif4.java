package javaprojecttest1;

import java.util.Scanner;

public class nestdif4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a>b)
		{
			System.out.println("a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a)
		{
			System.out.println("c is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
	}

}
