import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int h=scn.nextInt();
            int x=scn.nextInt();
            int y=scn.nextInt();
            int c=scn.nextInt();

            int val=0;
            val=x+(y/2);
            val*=h;

            if(val>c)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
    }
}