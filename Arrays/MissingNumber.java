import java.util.*;
public class MissingNumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
int sum=0;
for(int i=0;i<n-1;i++){
arr[i]=sc.nextInt();
sum=sum+arr[i];
}
int expectedsum=n*(n+1)/2;
int res=expectedsum-sum;
System.out.print(res);
}
}