//Two pointer Appraoch

import java.util.*;
public class StrPalindrome{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int l=0;
int r=s.length()-1;
boolean p=false;
while(l<r){
if(s.charAt(l)==s.charAt(r)){
p=true;
l++;
r--;;
}
else{
p=false;
break;
}
}
if(p){
System.out.print("true");
}
else{
System.out.print("false");
}
}
}


// Reverse Approach


/*import java.util.*;
public class StrPalindrome{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
String rev="";
for(int i=s.length()-1;i>=0;i--){
rev+=s.charAt(i);
}
if(s.equals(rev)){
System.out.print("palindrome");
}
else{
System.out.print("not palindrome");
}
}
}*/

