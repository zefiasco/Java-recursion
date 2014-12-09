package pascalTriangle;

/* Program to print pascal triangle for 10 rows in java */
public class PascalTriangle 
{
	protected void printTriangle(int numberOfRows)
	{
		 for(int i =0;i<numberOfRows;i++) 
		 {
	            int number = 1;
	            System.out.format("%"+(numberOfRows-i)*2+"s","");
	            
	            for(int j=0;j<=i;j++) 
	            {
	                 System.out.format("%4d",number);
	                 number = number * (i - j) / (j + 1);	                
	            }
	            //print new line
	            System.out.println();
	      }
	        
	}
    
}
