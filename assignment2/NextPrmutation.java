import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			NePer(arr);
			for (int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	public static void NePer(int[] arr) 
	{
		int a=0;
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]<arr[i+1])
			{
				a=i;
				break;
			}
		}
		int b=0;
		for(int i=arr.length-1;i>a;i--)
		{
			if(arr[i]>arr[a])
			{
				b=i;
				break;
			}
		}
		if(a==0&&b==0)
		{
			Reverse(arr,0,arr.length-1);
			return;
		}
		int t=arr[a];
		arr[a]=arr[b];
		arr[b]=t;
		Reverse(arr,a+1,arr.length-1);
	}
	public static void Reverse(int[] arr,int i,int j)
	{
		while(i<j)
		{
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}
}
