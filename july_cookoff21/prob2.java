import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           int x=scn.nextInt();
           int y=scn.nextInt();

           int sum=x+y;
           int x=Math.min(x,y);
           int y=sum-x;

           
        }
    }
    public static int gcd(int a,int b){
        if(a==1)
        return b;

        return gcd(b%a,a);
    }
}