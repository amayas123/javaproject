package javaprojecttest1;

import java.util.Scanner;

public class javaswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int operations=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		int sub=0;
		int mul=0;
		int div=0;
		switch(operations) {
		case 1:
			sum=a+b;
			System.out.println("sum =" +sum);
			break;
		case 2:
			sub=a-b;
			System.out.println("sub =" +sub);
			break;
		case 3:
			mul=a*b;
			System.out.println("mul =" +mul);
			break;
		case 4:
			div=a/b;
			System.out.println("div =" +div);
			break;
			default:
				System.out.println("invalid input");
			
		}
		}

}
