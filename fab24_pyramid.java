package homework;

import java.util.Scanner;

public class fab24_pyramid {
	
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		int space = n, star = 1;

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
			System.out.print(" *");
			}
			
			if(i<=n)
			{
				space--;
				star += 1;
			}
			System.out.println();
		}
	}
}
		
		


