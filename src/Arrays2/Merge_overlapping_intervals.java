package Arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_overlapping_intervals {
    public static List<List<Integer>> merge(int arr[][]){
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> ans = new ArrayList<>();

        //if ans is not empty and current interval lies in the exisiting ans
        for(int i=0;i<arr.length;i++){
            //current interval
            int start = arr[i][0];
            int end = arr[i][1];

            //skip the interval -- when the current interval already exists in the interval
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            //merge and add - for the current interval check if any overlappings are there in the array
            // if exists then update the end
            for(int j=i+1;j<arr.length;j++){
                if(arr[j][0]<=end){
                    end=Math.max(end,arr[j][1]);
                }
                else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
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
