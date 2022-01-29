import java.util.Scanner;
class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();

            int i=0;
            long sum=0l;
            while(i+2<=n){
                sum+=((i+2)^(i+1))*2l;
                i+=2;
            }
            System.out.println(sum);
        }
    }
}