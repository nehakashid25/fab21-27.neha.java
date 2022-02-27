package homework;

import java.util.Scanner;

public class fab21_check_number_is_powerof2 {
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ::");
		double num = scan.nextDouble();
		
		  while (num>1)
		  {
			  num = num/2;
			  System.out.println(num);
			  
		  }
		 
		  boolean result = (num==1)? true : false;
		  
			  System.out.print(result);
		
			 
	}
		

}
