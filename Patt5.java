package Pattern;

import java.util.Scanner;
/*WAP to print this pattern...
  	12345
	12345
	12345
	12345
	12345
 */
public class Patt5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of rows");
	int n=sc.nextInt();
	/*int i=1;
	while (i<=n) {
		int j=1;
		while (j<=n) {
			System.out.print(j);
			j++;
			//j=j+1;
		}
		System.out.println();
		i++;
		//i=i+1;*/
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
		
	}
}

