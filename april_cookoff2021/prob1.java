import java.util.Scanner;
import java.util.HashSet;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int x=scn.nextInt();
            HashSet<Integer>map=new HashSet<>();
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                map.add(a);
            }
            System.out.println(Math.min(map.size(),(n-x)));
        }
    }
}