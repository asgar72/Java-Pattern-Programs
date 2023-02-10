package Pattern;
/* WAP to print this pattern...
 
 @@@
  @  
***
* *
* *																				 */

public class Patt_19 {
		public static void main(String[] args) {
			int n=3,i,j,s;
	        for(i=1;i<=n-1;i++)
	        {
	            for(s=1;s<=i;s++)
	            {
	                System.out.print(" ");
	            }
	            for(j=1;j<=n;j++)
	            {
	                if(i==1 || j==1 )
	                System.out.print("@");
	                else
	                System.out.print(" ");
	            }
	            System.out.println();
	        }    
	            for(i=1;i<=n;i++)
	            {
	                for(j=1;j<=n;j++)
	                {
	                    if(i==1 || j==1  ||j==n)
	                    System.out.print("*");
	                    else
	                    System.out.print(" ");
	                }
	            System.out.println();
	            } 
	    }
}


/*

@@@ 
 @

*/


/*
public class Patt_19{
   public static void main(String[] args) {
       int n=3,i,j,s;
       for(i=1;i<=n-1;i++)
       {
           for(s=1;s<=i;s++)
           {
               System.out.print(" ");
           }
           for(j=1;j<=n;j++)
           {
               if(i==1 || j==1 )
               System.out.print("@");
               else
               System.out.print(" ");
           }
           System.out.println();
       }
   }
}
*/


/*

* * *
*   *
*   *

*/


/*
public class Patt_19{
   public static void main(String[] args) {
       int n=3,i,j;
       for(i=1;i<=n;i++)
       {
           for(j=1;j<=n;j++)
           {
               if(i==1 || j==1  ||j==n)
               System.out.print("* ");
               else
               System.out.print("  ");
           }
           System.out.println();
       }
   }
}
*/
