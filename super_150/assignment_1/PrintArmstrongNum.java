import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i=n;
		while(i<=m)
		{
			int a=i;
			int b=i;
			String str = String .valueOf(a);
        	int len = str.length();
			int sum=0;
			while(a>0)
			{
				int rem=a%10;
				sum=sum+(int)(Math.pow(rem,len));
				a=a/10;
			}
			if(sum==b)
			{
				System.out.println(b);
			}
			i++;
		}
    }
}
