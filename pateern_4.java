/*	*****
	*   *
	*   *
	*****
*/
package super_150;
import java.util.*;
public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int col=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1 || j==1 || i==r || j==col)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
