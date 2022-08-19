/*

    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
*/
package super_150;
import java.util.*;
public class pattern_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+ " ");
				
			}
			System.out.println();
		}
	}
}
