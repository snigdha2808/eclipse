package multiplication;
import java.util.*;
public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int n[] = new int[size];
		for(int i=0;i<size;i++)
		{
			n[i]=sc.nextInt();
		}
		int min=9999999;
		int max=-9999999;
		for(int i=0;i<size;i++)
		{
			if(min>n[i])
			{
				min=n[i];
			}
			if(max<n[i])
			{
				max=n[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}

}
