package Arrays2;

public class Count_Inversions_OP {
    private static int conquer(int[] arr, int si, int mid, int ei) {
        //end index - start index +1 = size
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2=mid+1;
        int count =0;
        int x =0; // tracker for merged
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x]=arr[idx2];
                count += (mid - idx1 + 1);
                x++;
                idx2++;
            }
        }
        //if any leftover from both arrays add them to merged
        while(idx1<=mid){
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        while(idx2<=ei){
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }
        //add these elements to the main array from merged array
        //i in the merged array will be si in the main array
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
        return count;
    }
    private static int divide(int[] arr, int si, int ei){
        //base case
        if(si>=ei) return 0;
        int count =0;
        int mid = si+(ei-si)/2;
        count+=divide(arr,si,mid);
        count+=divide(arr,mid+1,ei);
        count+= conquer(arr,si,mid,ei);
        return count;
    }



    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        int count = divide(arr,0,arr.length-1);
        System.out.println(count);
    }
}

