import java.util.*;
public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0,rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%8;
			sum+=rem*(Math.pow(10,i));
			n=n/8;
			i++;
		}
		System.out.println(sum);
	}

}
