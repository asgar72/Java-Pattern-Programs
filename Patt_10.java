package Pattern;

import java.util.Scanner;

/*WAP to print this pattern...
	1 
	2 3
	3 4 5
	4 5 6 7
	5 6 7 8 9
*/
public class Patt_10 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number");
			int n = sc.nextInt();
						
			/*int row=1;
			while (row<=n) 
			{
			int col=1;
			int value=row;
			while (col<=row) 
			{
				System.out.print(value+" ");
				value++;
				col++;
			}
			System.out.println();
			row++;
			}*/
			
			
			/*int row,col;
			for(row=1;row<=n;row++)
			{
				int value=row;
				for(col=1;col<=row;col++)
				{
					System.out.print(value++ +" ");
				}
				System.out.println();
			}*/
			
			int row,col;
			for(row=1;row<=n;row++)
			{
			
				for(col=1;col<=row;col++)
				{
					System.out.print(row+col-1 +" ");
				}
				System.out.println();
			}
		}
}






