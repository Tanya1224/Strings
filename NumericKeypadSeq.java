package STRINGS;

public class NumericKeypadSeq {
    static String printSeq(String arr[],String s){
        String output="";
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' ') 
            output=output+"0";
            else{
                int pos=s.charAt(i)-'A';
                output=output+arr[pos];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String str[] = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
                String s="TANYA GUPTA";
                System.out.println(printSeq(str, s));
    }
}
