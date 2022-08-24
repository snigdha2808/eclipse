import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println(0);
		}
		else if(n==2)
		{
			System.out.println(0+"\n"+"1	1");
		}
		else
		{
			int a=1,b=1;
			System.out.println(0+"\n"+"1	1");
			for(int i=3;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					int c=a+b;
					a=b;
					b=c;
					System.out.print(c+"	");
				}
				System.out.println();
			}
		}

    }
}
