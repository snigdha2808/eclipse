import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int min=Math.min(n,n1);
		while(min>0)
		{
		if(min%n==0 && min%n1==0)
		{
			System.out.println(min);
			break;
		}
		min++;
		}
    }
}
