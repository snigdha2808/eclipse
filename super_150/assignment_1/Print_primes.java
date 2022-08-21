import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c;
		for(int j=2;j<=n;j++)
		{
			c=0;
			for(int i=1;i<=j;i++)
			{
            	if(j%i==0)
				{
                	c++;
            	}
         	}
         	if(c==2)
         	System.out.println(j);
      	}	
    }
}
