import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int rem=0,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum+=rem*(Math.pow(2,i));
			n=n/10;
			i++;
		}
		System.out.println(sum);
	}

}
