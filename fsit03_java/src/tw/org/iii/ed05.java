package tw.org.iii;

public class ed05 
{

	public static void main(String[] args) 
	{
		for(int i = 1; i < 100; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				int m = (int)(Math.pow(i, 2) + Math.pow(j, 2));
				for(int k = 0; k < 100; k++ )
				{ 
					if(Math.pow(k, 2) == m)
					{
						System.out.printf("(%2d,%2d,%2d)" + "\n",j , i, k);
					}	
				}
			
			}
			
		}
	}
}
