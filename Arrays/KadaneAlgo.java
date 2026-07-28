import java.util.*;
public class KadaneAlgo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        System.out.print(max);
    }
    
}
