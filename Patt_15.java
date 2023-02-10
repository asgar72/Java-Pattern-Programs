package Pattern;

import java.util.Scanner;

/*
    WAP to print this pattern...
	1234554321
	1234**4321
	123****321
	12******21
	1********1
 */
public class Patt_15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of rows : ");
	int n = sc.nextInt();
	int i,s,j,k;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n-i+1;j++)
		{
			System.out.print(j);
		}
		for(s=1;s<=i-1;s++)
		{
			System.out.print("**");
		}
		/*for(s=1;s<=i-1;s++)
		{
			System.out.print("*");
		}*/
		for(k=1;k<=n-i+1;k++)
		{
			System.out.print(n-k+1);
		}
		System.out.println();
	}
}
}
