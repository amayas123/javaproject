package javaprojecttest1;

import java.util.Scanner;

public class ifelsetask2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18&& age<=15) {
		System.out.println("eligible for donating blood");
		}
		else
		{
			System.out.println("not eligible for donating blood");
		}
		// TODO Auto-generated method stub

	}

}
