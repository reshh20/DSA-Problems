import java.util.*;
public class ConcatenationArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] res=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            res[i]=arr[i];
            res[i+n]=arr[i];
        }
        System.out.print(Arrays.toString(res));
    }
}