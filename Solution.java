import java.util.Scanner;
public class Main{
	public static Scanner scn=new Scanner(System.in);
public static void main(String[]args){
	int t=scn.nextInt();
	while(t-->0){
		int n=scn.nextInt();
		int x=scn.nextInt();
		
		if(x>=n){
			System.out.println(1);
			continue;
		}
		if(n==1){
			if(x==0)
				System.out.println(-1);
			else
				System.out.println(1);
			continue;
		}
		
		int c=0;
		while(n>1){
			int a=sol(n);
			int val=(int)Math.pow(2,a);
			int b=n-val;
			if(a%2==0)
				c++;
			
			n=b;
			c++;
			
			if(n<=x){
				if(n!=0)
				c++;
				break;
			}
		}
		
		if(n!=0 && n>x)
			System.out.println(-1);
		
			else 
				System.out.println(c);
	}
}
	
	
	public static int sol(int n){
		int c=0;
		while(n>1){
			n/=2;
			c++;
		}
		return c;
	}
}