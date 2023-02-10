package Pattern;

import java.util.Scanner;
/*
 WAP to print this pattern...
 1
 2 1
 3 2 1
 4 3 2 1
 5 4 3 2 1
 */
public class Patt_11 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter no. of row");
				int n=sc.nextInt();
				
				/*int row=1;
				while (row<=n) 
				{
				int col=1;
				while (col<=row) 
				{
					System.out.print(row-col+1 +" ");
					col++;
				}
				System.out.println();
				row++;
				}*/
				
				int row,col;
				for(row=1;row<=n;row++)
				{
				
					for(col=1;col<=row;col++)
					{
						System.out.print(row-col+1 +" ");
					}
					System.out.println();
				}
			}
}
