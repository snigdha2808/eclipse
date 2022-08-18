/*

    *****
   *****
  *****
 *****
*****

*/
package super_150;
import java.util.*;
public class Pattern_7 {

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
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
