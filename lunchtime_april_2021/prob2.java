import java.util.Scanner;
 class CodeChef{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int sum=0;
        int mod=((int)Math.pow(10,9))+7;
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            sum+=a;
        }
        int q=scn.nextInt();
        while(q-->0){//
            int a=scn.nextInt();
            sum=((sum)*2)%mod;
            System.out.println(sum);
        }
    }
}