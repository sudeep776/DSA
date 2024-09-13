package Arrays1;

import java.util.ArrayList;
import java.util.List;

//print pasccal triangle
// - nCr - n! / (n-r)! . r! --
// use recursion to start with the rows and call rows-1
// base case for 0 and 1 rows --
//add every row to a list and add that list to the resultant matrix
public class Pascal_triangle_OP {
    public static List<List<Integer>> generateRows(int numRows) {
        List<List<Integer>> prevRows = new ArrayList<>();
        if(numRows==0) return prevRows;
        if(numRows==1) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(1);
            prevRows.add(result);
            return prevRows;
        }
        List<Integer> result = new ArrayList<>();
        prevRows = generateRows(numRows-1);
        int res=1;
        result.add(1);
        for(int i=0;i<numRows-1;i++){
            res = res*(numRows-i-1);
            res = res/(i+1);
            result.add(res);
        }prevRows.add(result);
        return prevRows;
    }
    public static void main(String[] args) {
        List<List<Integer>> prevRows = generateRows(4);
        System.out.println(prevRows);
    }
}
