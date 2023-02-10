package Pattern;

import java.util.Scanner;
/*WAP to print this pattern...
 
 		1  2  3 
 		4  5  6 
 		7  8  9 
 */
public class Patt7 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of rows :");
			int n=sc.nextInt();
			int i=1,count=1;
			while (i<=n) {
				int j=1;
				while (j<=n) {
					System.out.print(count+" ");
					count++;
					j++;
				}
				System.out.println();
				i++;
				}
		}
}
