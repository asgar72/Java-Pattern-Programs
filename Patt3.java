package Pattern;

import java.util.Scanner;

/*WAP to print this pattern...
	  		*
		   **
		  ***
		 ****
		*****				*/
public class Patt3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		int i,j,s;
		for (i=1;i<=n;i++) 
		{
			for (s=i;s<=n;s++) 
			{
				System.out.print(" ");
			}
			for (j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
	

*/
