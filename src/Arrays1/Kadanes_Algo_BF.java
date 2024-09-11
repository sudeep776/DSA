package Arrays1;
//max subarray sum
public class Kadanes_Algo_BF {
    public static void main(String[] args) {
        int maxi = Integer.MIN_VALUE;
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                sum+=arr[i];
                maxi = Math.max(maxi,sum);
            }
        }
    }
}
