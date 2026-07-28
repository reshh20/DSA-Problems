import java.util.*;
public class SecondLargest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int larg=Integer.MIN_VALUE;
int sl=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
if(arr[i]>larg){
sl=larg;
larg=arr[i];

}
else if(arr[i]>sl && arr[i]!=sl){
sl=arr[i];
}
}
System.out.print(sl);
}
}