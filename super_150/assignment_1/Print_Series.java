import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int i=1;
		int c=1;
		while(c<=n)
		{
			if(((3*i)+2)% n1!=0)
			{
				System.out.println(3*i+2);
				c++;
			}
			i++;
		}
    }
}
