import java.util.Scanner;
class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int a1=0,b1=0;
            for(int i=0;i<3;i++){
                int a=scn.nextInt();
                if(a==0)
                a1++;
               
            }
            for(int i=0;i<3;i++){
                int a=scn.nextInt();
                if(a==0)
                b1++;
                
            }
            if(b1==a1)
            System.out.println("Pass");
            else
            System.out.println("Fail");
        }
    }
}