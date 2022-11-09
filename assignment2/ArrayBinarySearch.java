import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int f=0,l=n-1;
		int m=(f+l)/2;  
   		while(f<=l)
		{  
      		if(arr[m]<key)
			{  
        		f=m+1;     
      		}
			else if( arr[m]==key)
			{  
        		System.out.println(m);  
        		break;  
      		}
			else
			{  
         		l=m-1;  
      		}  
      		m=(f+l)/2;  
   			}  
   			if(f>l)
			{  
      			System.out.println("-1");  
   			}  
	}
}
