import java.util.*;
public class TwoSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int need=target-arr[i];
            if(mp.containsKey(need)){
                System.out.print(need+" "+arr[i]);
                return;
            }
            mp.put(arr[i],i);
            
        }
        System.out.print("No pair found");


    }
}