import java.util.*;
public class DistinctElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            st.add(arr[i]);
        }
        System.out.print(st.size());
    }
    
}
