import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=1000000;
            for(int i=1;i<=(int)Math.sqrt(n);i++){
                int a=i*i;

                System.out.println(a);
                int ele=scn.nextInt();
                if(ele==1){
                    break;
                }

            }
        }
    }
}