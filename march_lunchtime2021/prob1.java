import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int a=scn.nextInt();
            int y=scn.nextInt();
            int x=scn.nextInt();
            long c=1l;

            if(a>=y){
                c=(x*1l)*y;
            }
            else{
                c=(x*1l)*a;
                c++;
            }
            System.out.println(c);
        }
    }
}