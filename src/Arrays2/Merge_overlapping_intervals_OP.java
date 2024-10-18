package Arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_overlapping_intervals_OP{
    public static List<List<Integer>> merge(int arr[][]){
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            //add - when empty or if it doesnt lie in the existing interval in the list
            if(ans.isEmpty() || arr[i][0]>ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }
            //merging if it exists in the interval
            else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
            }
        }return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        List<List<Integer>> res = merge(arr);
        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(i).size();j++){
                System.out.println(res.get(i).get(j));
            }
        }
    }
}

