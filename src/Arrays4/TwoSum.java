package Arrays4;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] findSumOp(int arr[],int target){
        Arrays.sort(arr);
        int result[] =  new int[2];
        int n = arr.length;
        int left =0;
        int right = n-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                result[0]=left;
                result[1]=right;
            }
            else if(sum<target)left++;
            else right--;
        }
        return null;
    }
    public static int[] findSum(int arr[],int target){
        int result[] = new int[2];
        result[0]=result[1]=-1;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i< result.length;i++){
            int num = arr[i];
            int moreNeeded = target-num;
            if(mpp.containsKey(moreNeeded)){
                result[0]=moreNeeded;
                result[1]=mpp.get(moreNeeded);
                return result;
            }
            mpp.put(arr[i],i);
        }return null;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        int n =5;
        findSum(arr,target);
    }
}
