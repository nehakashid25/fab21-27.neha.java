package homework;

import java.util.Scanner;

public class fab24_diamond_pattern {
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int space = n/2, star = 1;

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=star; j++)
			{
			System.out.print(" ");
			}
			
			if(i<=n/2)
			{
				space--;
				star += 2;
				
			}
			else
			{
				space++;
				star -= 2;
			}
			System.out.println();
			}	
	}

}



