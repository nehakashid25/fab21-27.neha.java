package homework;

public class fab21_1st_7_terms_of_Nprod6N_div_by6 {
	public static void main(String []arg)
	{
		int n=0, count =0;
		for(n=0 ; count <7 ; n++)
		{
			if(n%6==0)
			{
				int sum = n*6*n;
				System.out.println(sum);
				count ++;
			}
		}
	}

}
