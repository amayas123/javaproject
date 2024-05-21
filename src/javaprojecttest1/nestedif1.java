package javaprojecttest1;

import java.util.Scanner;

public class nestedif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num<0)
		{
			System.out.println("number is negative");
		}
		else  
		{
			System.out.println("the number is zero");
		}
	}

}
