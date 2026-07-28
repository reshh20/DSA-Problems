import java.util.*;
public class MaxOnes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int c=0;
int maxc=0;
for(int i=0;i<n;i++){
if(arr[i]==1){
c=c+1;
maxc=Math.max(maxc,c);
}
else{
c=0;
}
}
System.out.print(maxc);
}
}