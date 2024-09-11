package Arrays1;

import java.util.Arrays;

//better approach - keep a track of no of 0,1,2 and replace them in the same array

//op - low mid , high - pointers
// use mid for traversing -
//assumption - range of array between mid to high
public class Dutch_national_flag_OP {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0, 1};
        int low =0;
        int mid=0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                //swap mid and low
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                //swap mid and high
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        Arrays.stream(arr).forEach(e-> System.out.println(e));
    }
}
