package STRINGS;
import java.util.*;
public class EditDist {
    static int editDistance(String s, String t){
        int n=s.length();
        int m=t.length();
       int arr[][]=new int[n+1][m+1];
       for(int i=0; i<=n; i++){
           arr[i][0]=i;
       }
       for(int i=0; i<=m; i++){
           arr[0][i]=i;
       }
       for(int i=1; i<=n; i++){

           for(int j=1; j<=m; j++){

               if(s.charAt(i-1)==t.charAt(j-1)){

                   arr[i][j]=arr[i-1][j-1];

               }else{
                   arr[i][j]=Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]))+1;
               }
           }

       }

       return arr[n][m];
    }
    public static void main(String[] args) {
        String s="sunday";
        String t="saturday";
        System.out.println(editDistance(s,t));
    }
}
