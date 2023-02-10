package Pattern;

import java.util.Scanner;
/*WAP to print this pattern...
 	54321
	54321
	54321
	54321
	54321
 */
public class Patt6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of rows :");
	int n=sc.nextInt();
	/*int i=1;
	while (i<=n) {
		int j=1;
		while (j<=n) { 
			System.out.print(n-j+1);
			j++; 	//j=j+1;
		}
		System.out.println();
		i++;}		//i=i+1;*/
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(n-j+1);
		}
		System.out.println();
	}
}
}
