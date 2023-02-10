package Pattern;
import java.util.Scanner;
/*
 WAP to print this pattern...
 	1
 	2 3
 	4 5 6
 	7 8 9 10
 */
public class Patt9 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Entr number of rows");
			int n =sc.nextInt();
			int i=1;
			int Count=1;
			while (i<=n) {
				int j=1;
				while (j<=i) {
					System.out.print(Count+" ");
					Count++;
					j++;
				}
				System.out.println();
				i++;
			}
			int row,col;
			for(row=1;row<=n;row++)
			{
			
				for(col=1;col<=row;col++)
				{
					System.out.print(row+col+1+" ");
				}
				System.out.println();
			}
		}
}







