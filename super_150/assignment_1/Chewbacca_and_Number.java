import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        // Your Code Here
		long n=sc.nextLong();
		long sum=0;
		String str = String .valueOf(n);
        long len = str.length();
		long m=1;
		long c=1;
		while(n>0)
		{
			long rem=n%10;
			if(rem>4)
			{
				if(9-rem==0 && c==len)
				{
					rem=rem;
				}
				else
				{
					rem=9-rem;
				}
			}
			sum=sum+rem*m;
			n=n/10;
			c++;
			m=m*10;
		}
		System.out.println(sum);
    }
}
