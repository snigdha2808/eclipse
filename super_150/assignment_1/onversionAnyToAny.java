import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db=sc.nextInt();
        int num=sc.nextInt();
		int ans = 0;
        int mult = 1;
        while(num != 0){
            int rem = num % 10;
            ans  = ans + rem * mult;
            mult = mult * sb;
            num = num / 10;
		}
		mult = 1;
        num = ans;
        ans = 0;
        while(num != 0){
            int rem = num % db;
            ans  = ans + rem * mult;
            mult = mult * 10;
            num = num / db;
        }
		System.out.println(ans);
    }
