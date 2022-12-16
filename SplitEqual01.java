package STRINGS;

public class SplitEqual01 {
    static int maxSub(String str,int n){
        int c0=0;
        int c1=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0'){
                c0++;
            }
            else{
                c1++;
            }
            if(c0==c1){
                c++;
            }
        }
        if(c0!=c1){
            return -1;
        }
        return c;

    }
    public static void main(String[] args) {
        String str="0100110101";
        int n=str.length();
        System.out.println(maxSub(str, n));
    }
}
