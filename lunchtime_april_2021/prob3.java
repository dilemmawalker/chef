import java.util.Scanner;
import java.util.HashSet;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int w=scn.nextInt();
            int r=scn.nextInt();
            w=w-r;

            
            HashSet<Integer>map=new HashSet<>();
            
            long sum=0l;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                if(map.contains(a)){
                    map.remove(a);
                    sum+=a;
                }
                else{
                    map.add(a);
                }
            }

            if((sum*2)>=w)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}