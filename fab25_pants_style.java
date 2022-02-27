package homework;
import java.util.Scanner;
public class fab25_pants_style {
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter number");
		  int n = sc.nextInt();
		   for(int i = 0; i<n; i++)
		         {
		             for(int j = n ; j>i; j--) {
		            
		                 System.out.print("* ");
		             }
		             for(int k = 1; k<=4*i;k++) {
		             
		                 System.out.print(" ");
		             }
		             for(int j = i+1 ; j<=n; j++) {
		         
		                 System.out.print("* ");
		             }
		            
		             System.out.println();
		         }
		}

}
