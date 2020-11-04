package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {

		for (int i=2; i<=9; i++)
		{
			for (int j=1 ; j<=8 ; j++)
			{
				if (j==1)
				{
				System.out.printf("%d X %d = %d%n", i,1,i); 
				}
				
				int result = i;
				for (int k=1; k<=j; k++) 
				{
					result *= i;		
					System.out.printf("%d X ", i);
					if (k==j)
					{
					System.out.printf("%d = %d%n", i, result);		
					}
				}
			}
		}
	}
}
