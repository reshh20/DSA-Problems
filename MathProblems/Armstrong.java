import java.util.*;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum+(dig*dig*dig);
            n=n/10;
        }
        if(sum==temp){
            System.out.print("Yes! Armstrong");
        }
        else{
            System.out.print("No! Not Armstrong");
        }
    }
}