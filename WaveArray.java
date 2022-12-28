package STRINGS;
import java.util.*;
public class WaveArray {
    static void wave(int n, int[]a){
        int temp;
        for(int i=0;i<n;i=i+2){
            if(i+1==n){
                break;
            }
            temp=a[i+1];
            a[i+1]=a[i];
            a[i]=temp;
        }
    }
    public static void main(String[] args) {
        int n=5;
        int a[]={1,2,3,4,5};
        wave(n, a);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }


    }
}
