import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		int c=0;
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	   // Your Code Here
    }
}
