package Pattern;

/*WAP to print this pattern...
 			*
			**
			***
			****
			*****				*/
public class Patt2 {
	public static void main(String[] args) {
		int n = 5,i,j;
		for (i=1;i<=n;i++) 
		{
			for (j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 int n = 5;
		int i=1;
		while (i<=n) {
			int j=1;
			while (j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		 */
	}
}
