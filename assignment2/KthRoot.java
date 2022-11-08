import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner (System.in);
		int t;t=sc.nextInt();
		for(int i=0;i<t;i++){
		long n=sc.nextLong();
		int k=sc.nextInt();
		long x,s=0,e=n;
		long ans=0;
		while(s<=e)
		{
			long m=s+(e-s)/2;
			if((Math.pow(m,k))<=n)
			{
				ans=m;
				//ans1=Math.max(ans1, ans);
				s=m+1;
			}
			else
			{
				e=m-1;
			}
		}
		System.out.println(ans);
		}
    }
}
