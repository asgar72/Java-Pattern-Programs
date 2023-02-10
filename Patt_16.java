package Pattern;

import java.util.Scanner;
/*
 WAP to print this pattern...
 	11111
 	 2222
  	  333
   	   44
        5
 */
public class Patt_16 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter number of rows : ");
				int n=sc.nextInt();
				int i,j,s;
				for(i=1;i<=n;i++)
				{
					for(s=1;s<=i-1;s++)
					{
						System.out.print(" ");
					}
					for(j=1;j<=n-i+1;j++)
					{
						System.out.print(i);
					}
					
					System.out.println();
				}
				
			}
}
