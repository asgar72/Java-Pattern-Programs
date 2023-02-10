package Pattern;

import java.util.Scanner;

/*WAP to print this pattern...
 			*****
			*****
			*****
			*****
			*****			*/

public class Patt1 {
	public static void main(String[] args) {
		/* int n = 5,i,j;
		for (i=1;i<=n;i++) 
		{
			for (j=1;j<=n;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();
		int i=1;
		while (i<=n) {
			int j=1;
			while (j<=n) {
				System.out.print(i);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
