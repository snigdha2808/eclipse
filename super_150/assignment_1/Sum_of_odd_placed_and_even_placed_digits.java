import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1,even=0,odd=0;
		while(n>0)
		{
			if(c%2==0)
			{
				even+=n%10;
			}
			else
			{
				odd+=n%10;
			}
			c++;
			n=n/10;
		}
		System.out.println(odd);
		System.out.println(even);
    }
}
