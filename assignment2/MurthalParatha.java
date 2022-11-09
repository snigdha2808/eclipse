import java.util.*;
public class Main
{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int P=sc.nextInt();
		int L=sc.nextInt();
		int arr[]=new int[L];
		int ans=0;
		for(int i=0;i<L;i++)
		{
			arr[i]=sc.nextInt();
		}
		int start=1,end=100000;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			int cnt=0;
			for(int i=0;i<L;i++)
			{
				int x=2*mid/arr[i];
				cnt+=(Math.sqrt(1+4*x)-1)/2;
			}
			if(cnt>=P)
			{
				ans=mid;
				end=mid-1;
			}
			else
			{
			start=mid+1;
			}
		}
		System.out.println(ans);
    }
}
