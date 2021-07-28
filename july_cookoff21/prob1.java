import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            int aa=0,bb=0;
            if(a==0)aa++;
            else bb++;
            if(b==0)aa++;
            else bb++;
            if(c==0)aa++;
            else bb++;

            if(aa>0 && bb>0)
            System.out.println("1");
            else 
            System.out.println("0");
        }
    }
}