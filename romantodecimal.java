package STRINGS;
import java.util.*;
public class romantodecimal {
    static int rtd(String str){
        if(str==null || str.length()==0){
            return 0;
        }
        Map<Character,Integer>lm=new HashMap<>();
        lm.put('I',1);
 lm.put('V',5);
 lm.put('X',10);
 lm.put('L',50);
 lm.put('C',100);
 lm.put('D',500);
 lm.put('M',1000);
 int result=0;
 for(int i=0;i<str.length()-1;i++){
    if(lm.get(str.charAt(i))>=lm.get(str.charAt(i+1))){
        result+=lm.get(str.charAt(i));
    }
    else {
        result -= lm.get(str.charAt(i));
    }
 }
 result += lm.get(str.charAt(str.length()-1));

 return result;
    }
    public static void main(String[] args) {
        String str="MCMIV";
        System.out.println(rtd(str));
    }
}
