package Arrays4;

import java.util.HashMap;

public class Largest_subarray_K_sum {
    private static int Largestlength(int arr[],int K){
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int n = arr.length;
        int maxLength=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==K){
                maxLength=i+1;
            }
            else{
                if(mpp.get(sum)!=null){
                    //length calculation - current index - firstOccurence_distance
                    maxLength=Math.max(maxLength,i-mpp.get(sum-K));
                }
                else{
                    mpp.put(arr[i],i);
                }
            }
        }return maxLength;
    }
    public static void main(String[] args) {
        int arr[]= {1,-1,3,-2,2,-2};
        int result = Largestlength(arr,0);
        System.out.println(result);
    }
}
