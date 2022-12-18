package STRINGS;

public class KPM {
    static int longestPreSuff(String s){
        int n=s.length();
        if(n<2){
            return 0;
        }
        int len=0;
        int i=(n+1)/2;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                i++;
            }
            else{
                i=i-len+1;
                len=0;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String s="abcaabc";
        System.out.println(longestPreSuff(s));
    }
}
