import java.util.*;
public class CheckPrime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> res=new ArrayList<>();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c=c+1;
            }

        }
        if(c == 2){
                    System.out.print("yes number is prime");
                }
                else{
                    System.out.print("No number is not prime");
                }
        sc.close();

    }
}

//Optimized Approach
/*import java.util.*;
public class CheckPrime{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                c=c+1;
                if((n/i)!=i){
                    c=c+1;
                }
            }
        }
        if(c==2){
            System.out.print("yes number is prime");
        }
        else{
            System.out.print("no not prime");
        }

    }
}*/