package homework;

import java.util.Scanner;

public class fab23_courses_branch {
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter year");
		int years = scan.nextInt();
		
		switch (years)
		{
		case 1:
			System.out.println("enter semester");
			int semester = scan.nextInt();
			
			switch (semester)
			{
			case 1:
				System.out.println("subjects are Chemistry , Mathematics 1 ,Applied Mechanics, Basic Electrical, C programming, Electronics ");
				break;
				
			case 2:
				System.out.println("subjects are Physics ,Mathematics 2, Graphics, Workshop, Civil Engg., Communication Skills ");
				break;
			}
			break;
		case 2 :
		case 3 :
		case 4 :
			System.out.println("enter course name");
			String branch = scan .next();
			switch (branch)
			{
			case "IT" :
			case "CSC" :
				System.out.println("you have opted for computer branch");
				break;
			case "EE" :
			case "ECE":
				System.out.println("you have opted for electrical branch");
				break;
			case "MECH" :
				System.out.println("you have opted for mechanical branch");
				break;
			default :
				System.out.println("invalid branch");
				break;
			}
			break;
			default :
				System.out.println("invalid input");		
				 
			}
			
	}
}
