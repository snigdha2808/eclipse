package multiplication;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			sum=sum+a;
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println(sum);
	}

}
