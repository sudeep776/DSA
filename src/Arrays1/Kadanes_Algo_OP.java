package Arrays1;

//op - max subarray sum
// traverse the array - add the elements to sum if it's greater than max set sum to max
//if sum<0 set the sum to 0
// Note -- If there are two parts of an array capable of finding max we need to have start as a traversing pointer
// and update it only when we get the max
public class Kadanes_Algo_OP {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,-1,5,4};
        int maxi = Integer.MIN_VALUE;
        int start =0;
        int ansStart = -1, ansEnd = -1;
        int end=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0) start=i;
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxi);
        System.out.println(start+" startpos " + end + " endpos");
    }
}
