package javaprojecttest1;

import java.util.Scanner;

public class javaswitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		switch( day ) {
		case 1:
		System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:System.out.println("wednesday");
		break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default:
				System.out.println("invalid input");
				
		}

	}

}
