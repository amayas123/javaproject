package javaprojecttest1;

public class forloop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		for(int i=row; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
