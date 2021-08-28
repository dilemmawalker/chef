import java.util.*;
 class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int[]arr=new int[n];
            long sum=0l;
            int min=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
               int a=scn.nextInt();
               arr[i]=a;
               min=Math.max(min,a);
            }

            // Deque<Integer>deque=new LinkedList<>();

            // for(int i=0;i<k-1;i++){
            //     int a=arr[i];
            //     while(deque.size()!=0 && arr[deque.getLast()]<a){
            //         deque.removeLast();
            //     }
            //     deque.addLast(i);
            // }
            // for(int i=k-1;i<n;i++){
            //     int a=arr[i];
            //     int p=i-k-1;
                

            //     while(deque.size()!=0 && arr[deque.getLast()]<a){
            //         deque.removeLast();
            //     }
            //     deque.addLast(i);

            //     if(i==deque.getFirst())
            //     sum++;
            //     if(deque.getFirst()==p)
            //     deque.removeFirst();
            // }
            // System.out.println(sum);

            int max=min;
            int mod=(int)Math.pow(10,9)+7;
            for(int i=k-1;i<n;i++){
               int a=arr[i];
              if(a==max)
              sum+=(n-i)*1l;
              
            }
             System.out.println(sum);
        }

    }
}