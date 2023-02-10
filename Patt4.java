package Pattern;

import java.util.Scanner;

/*WAP to print this pattern...
				 *
				***
			   *****
			  *******
		   	 *********		 */
public class Patt4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		int i,j,s;
		for (i=1;i<=n;i++) 
		{
			for (s=1;s<=n-i;s++) 
			{
				System.out.print(" ");
			}
			for (j=1;j<=2*i-1; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
