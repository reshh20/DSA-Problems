import java.util.*;
public class FrequencyChar{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
LinkedHashMap<Character,Integer> mp=new LinkedHashMap<>();
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(mp.containsKey(ch)){
mp.put(ch,mp.get(ch)+1);
}
else{
mp.put(ch,1);
}
}
for(char key:mp.keySet()){
System.out.print(key+":"+mp.get(key));
}
}
}