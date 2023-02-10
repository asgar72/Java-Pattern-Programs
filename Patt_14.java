package Pattern;

import java.util.Scanner;

/*
  WAP to print this pattern...
      1 
    1 2 1 
  1 2 3 1 2 
1 2 3 4 1 2 3
 */
public class Patt_14 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no. of rows : ");
			int n = sc.nextInt();
			int s,i,j,k;
			for(i=1;i<=n;i++)
			{
				for(s=1;s<n-i+1;s++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				for(k=1;k<=i-1;k++)
				{
					System.out.print(k);
				}
				System.out.println();
			}
}
}
