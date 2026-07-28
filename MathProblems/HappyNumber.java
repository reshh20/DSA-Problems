import java.util.*;
public class HappyNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        HashSet<Integer> st=new HashSet<>();
        while(n!=1 && !st.contains(n)){
            st.add(n);
            int sum=0;
            while(n>0){
                int dig=n%10;
                sum=sum+(dig*dig);
                n=n/10;
            }
            n=sum;

        }
        if(n==1){
            System.out.print("Yes! HappyNumber");
        }
        else{
            System.out.print("No! Not HappyNumber");
        }
    }
    
}

