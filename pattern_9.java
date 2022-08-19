/*

    1
   212
  32123
 4321234
543212345
*/
package super_150;
import java.util.*;
public class pattern_9 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
				
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
