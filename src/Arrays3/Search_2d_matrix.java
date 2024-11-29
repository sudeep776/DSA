package Arrays3;

//bf - to go through  range of each row and check if target exists
// if it exists use binary search on the particular row
public class Search_2d_matrix {
    private static boolean searchElement(int arr[][],int target){
        int n = arr.length;
        int m = arr[0].length;
        int low =0;
        int high = (n*m)-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if(arr[row][col]==target) return true;
            else if(arr[row][col]<target)low=mid+1;
            else high=mid-1;
        }return false;
    }
    public static void main(String[] args) {
       int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       Boolean result =searchElement(arr,8);
        System.out.println(result);
    }
}
