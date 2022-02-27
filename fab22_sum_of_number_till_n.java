package homework;

import java.util.Scanner;

public class fab22_sum_of_number_till_n {

	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt(),i=1, sum=0;
		
		 while(n>0)
		 {
			 sum= sum+n;
			 n--;
			 
			 
		 }
		 System.out.print(sum);
	}
			
		

}
