package pascalTriangle;

import java.util.Scanner;

public class WeirdLoop {

	public static void main(String[] args) 
	{
                //change this variable to get more lines

       Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Enter the row number to be printed: ");
	    int nbrOfRows = scanner.nextInt();
	    scanner.close();
		//int nbrOfRows = 5;
		
		for (int i = 0; i<=nbrOfRows; i++)
		{
			for (int j = 1; j<=i; j++)
			{
				if(j>=0 && j <i)
				{
					System.out.print(j+" ");
				}
				if(j==i)
				{
					for (int k = j; k>0; k--)
					{
						System.out.print(k+" ");
					}
				}
				
			}
			
			System.out.println();
			
		}

	}

}
