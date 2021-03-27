import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            long x=0l,r=0l,m=0l;
             x=scn.nextInt();
             r=(scn.nextInt()*1l)*60;
             m=(scn.nextInt()*1l)*60;
            
            long c=0l;
            
            if(x>=r)
            c=r;
            else{
            c=((r-x)*1l)*2;
            c+=x;
            }

            if(c<=m)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}