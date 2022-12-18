package STRINGS;
import java.util.*;
public class SearchPatt {
    ArrayList<Integer> search(String pat, String S){
    ArrayList <Integer> list=new ArrayList<>();
    for(int i=0;i<=S.length();i++){
        int index=S.indexOf(pat,i);
        if(index==-1) break;
        i=index;
        list.add(index+1);
    }
    if(list.size()==0) list.add(-1);
    return list;
}
public static void main(String[] args) {
    String S="batmanandrobinarebat";
    String pat="bat";
    SearchPatt ob=new SearchPatt();
    ArrayList<Integer> res=ob.search(pat, S);
    for(int i=0;i<res.size();i++){
        System.out.println(res.get(i)+" ");
        System.out.println();
    }

    

}
}