package STRINGS;

public class countStringin2d {
    static int solve(String s,int row, int col,String h[],int row_max, int col_max,int idx){
        int found=0;
        if(row>=0 && col>=0 && row<=row_max && col<=col_max && idx<s.length()&& s.charAt(idx)==h[row].charAt(col)){
            char temp=s.charAt(idx);
            idx+=1;
            h[row]=h[row].substring(0,col)+"0"+ h[row].substring(col+1);       
                 if(idx==s.length()){
                    found=1;
                 }
            else{
                found += solve(s, row,
                                    col + 1, h,
                                    row_max, col_max,idx);
            found += solve(s, row, col - 1,
                                    h, row_max, col_max,idx);
            found += solve(s, row + 1, col,
                                    h, row_max, col_max,idx);
            found += solve(s, row - 1, col,
                                    h, row_max, col_max,idx);
            }
            h[row] = h[row].substring(0, col) + temp +
                   h[row].substring(col + 1);

        }
        return found;
    }
    static int searchString(String needle, int row, int col,
                        String str[], int row_count,
                                      int col_count)
{
    int found = 0;
    int r, c;
 
    for(r = 0; r < row_count; ++r)
    {
        for(c = 0; c < col_count; ++c)
        {
            found += solve(needle, r, c, str,
                                    row_count - 1,
                                    col_count - 1, 0);
        }
    }
    return found;
}
    public static void main(String[] args) {
        String s="MAGIC";
        String input[]={
            "BBABBM", "CBMBBA",
                       "IBABBG", "GOZBBI",
                       "ABBBBC", "MCIGAM"
        };
        String str[] = new String[input.length];
    int i;
    for(i = 0; i < input.length; ++i)
    {
        str[i] = input[i];
    }
 
    System.out.println("count: " +
              searchString(s, 0, 0, str,
                           str.length,
                           str[0].length()));

    
    }
}


