package homework;

import java.util.Scanner;

public class fab22_factorial_using_while {
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt(), fact=1;
		
		while(n>0)
		{
			fact = fact*n;
			System.out.print(n+"*");
			n--;
		}
		System.out.print("="+fact);
	}

}
