package LL_Arrays;

public class Trapping_rain_water {
    public static int trapped_Water(int arr[]){
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[]=new int[n];
        //update leftMax
        leftMax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }

        //update rightMax
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }

        int trappedWater=0;
        for(int i=0;i<arr.length;i++){
            int water = Math.min(leftMax[i],rightMax[i])-arr[i];
            trappedWater+=water;
        }return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,1,0,1,3,2,1,2,1};
        int result = trapped_Water(arr);
        System.out.println(result);
    }
}
