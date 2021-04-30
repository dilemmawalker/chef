import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int l=scn.nextInt();

            String str=scn.next();
            int sum=0;
            int i=0;
            for( i=0;i<l;i++){
                char ch=str.charAt(i);
                int val=ch-'0';
                if(val==0){
                    sum=sum-1;
                }
                else{
                    sum=sum+1;
                }
                if(sum==0||sum==1){
                    System.out.println("YES");
                    break;
                }
            }
            if(i==l)
            System.out.println("NO");
        }
    }
}