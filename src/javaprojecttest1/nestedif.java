package javaprojecttest1;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int exam=sc .nextInt();
		int viva=sc .nextInt();
		if (exam>=30)
		{
			if (viva>=10)
			{
				System.out.println("eligible");
			}
			else 
			{
				System.out.println("not eligible in viva");
			}
		}
		else 
		{
			System.out.println("not eligible");
		}
	
		// TODO Auto-generated method stub
	}
}
	


