package javaprojecttest1;

public class dowhile6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=500;
	int sum=0;
		do
		{
			if(i%2==0 && i<=1000) {
				System.out.println(i);
				sum=sum-i;
			}
					i++;
				
		}while(i<1000);
		System.out.println("summation:" +sum);
}
}