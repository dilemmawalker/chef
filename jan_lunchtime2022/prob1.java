import java.util.Scanner;
 class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            if(n==1 && k==1){
               System.out.println(1); 
            }
            else if(n>1 && k==1){
                System.out.println(-1);
            }
            else{
                for(int i=1;i<k;i++){
                    System.out.print(i+" ");
                }
                for(int i=k+1;i<=n;i++){
                    System.out.print(i+" ");
                }
                System.out.println(k);
            }

        }
    }
}