package Pattern;

import java.util.Scanner;

/*
WAP to print this pattern...
 	1
 	2 2
 	3 3 3
 	4 4 4 4
 	5 5 5 5 5
*/
public class Patt8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
/*
  Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :");
			int n = sc.nextInt();
			int row=1;
			while (row<=n) 
			{
				int col=1;
				while (col<=row) {
					System.out.print(row + " ");
					col++;
				}
				System.out.println();
				row++;
			}
 */