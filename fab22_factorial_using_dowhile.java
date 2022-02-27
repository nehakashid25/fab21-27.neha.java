package homework;

import java.util.Scanner;

public class fab22_factorial_using_dowhile {
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt(), fact=1;
		
		do
		{
			fact = fact*n;
			 
			n--;
		}
		while(n>0);
		{
			System.out.print(fact);
		}
		
	}

}
