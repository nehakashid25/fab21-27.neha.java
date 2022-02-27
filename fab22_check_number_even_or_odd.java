package homework;

import java.util.Scanner;

public class fab22_check_number_even_or_odd {
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		
		if(n%2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
	}

}
