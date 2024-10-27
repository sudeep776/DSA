package Practice;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static List<List<Integer>> generateRows(List<List<Integer>> result,int rows){
        if(rows==0) return new ArrayList<>();
        generateRows(result ,rows-1);
        List<Integer> rowList = new ArrayList<>();
        rowList.add(1);
        int res = 1;
        for(int i=0;i<rows-1;i++){
            res = res * (rows-i-1);
            res=res/(i+1);
            rowList.add(res);
        }
        result.add(rowList);
        return result;
    }
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> res = generateRows(result,4);
        System.out.println(res);
    }
}
