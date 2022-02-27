package homework;

import java.util.Scanner;

public class fab22_Calculate_number_of_digit {
	
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt(), count=0;
		
		while(n>0)
		{
			n = n/10;
			count++;
			
		}
		System.out.println(count);
	}

}
