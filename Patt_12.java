package Pattern;
import java.util.Scanner;

/*
 	WAP to print this pattern...
 	*****
 	****
 	***
 	**
 	*

 */
public class Patt_12 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter no. of rows : ");
				int n = sc.nextInt();
				int i,j;
				for(i=1;i<=n;i++)
				{
					for(j=1;j<=n-i+1;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			}
}
