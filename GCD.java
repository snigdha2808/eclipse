package multiplication;
import java.util.*;
public class GCD {
	public static int calculateGcd(int a,int b)
	{
		int res=Math.min(a,b);
		while(res>0)
		{
			if(a%res==0 && b%res==0)
			{
				break;
			}
			res--;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=calculateGcd(a,b);
		System.out.println(res);
	}

}
