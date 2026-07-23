import java.util.*;
public class Divisors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                res.add(i);

            }
        }
        System.out.print(res);
        sc.close();

    }

    
}

//Optimized Approach
/*import java.util.*;
public class Divisors{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                res.add(i);
                int c=n/i;
                if(c!=i){
                    res.add(c);
                }
            }
        }
        System.out.print(res);
        sc.close();
    }
}*/


