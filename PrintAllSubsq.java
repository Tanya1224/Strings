package STRINGS;
import java.util.*;
public class PrintAllSubsq {
    static List<String> a1 = new ArrayList<>();
    public static void main(String[] args) {
        String s="abcd";
        findsubsequences(s, "");
        System.out.println(a1);
        
    }
    private static void findsubsequences(String s,String ans){
        if(s.length()==0){
            a1.add(ans);
            return;
        }
        findsubsequences(s.substring(1), ans+s.charAt(0));
        findsubsequences(s.substring(1), ans);
    }
}
