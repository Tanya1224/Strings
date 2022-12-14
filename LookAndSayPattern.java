package STRINGS;
import java.util.*;
public class LookAndSayPattern {
    static String lookandsay(int n){
        String s = "1";     
       while(n > 1){
        char ch=s.charAt(0);
        int count=0;
        String num="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ch){
                count++;
                if(i == s.length()-1){
                    num += String.valueOf(count)+String.valueOf(ch);
                }
            }
            else{
                num+=String.valueOf(count)+String.valueOf(ch);
                count=1;
                ch=s.charAt(i);
                if(i == s.length()-1){
                    num += String.valueOf(count)+String.valueOf(ch);

                }

                }

             }

             n--;

             s=num;            

        }

        return s; 
    }
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(lookandsay(n));
    }
}
