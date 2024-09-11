package Arrays1;

import java.util.ArrayList;
import java.util.List;

//print pasccal triangle
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
