package homework;

import java.util.Scanner;

public class fab21_div_by2_4_not_12 {
	
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ::");
		double num = scan.nextDouble();
		
		boolean result = ((num%2==0) && (num%8==0) && !(num%12==0));
		System.out.print(result);
	}
	
}