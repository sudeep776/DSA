package Sorting;

public class Merge_sort {

    private static void conquer(int[] arr, int si, int mid, int ei) {
        //end index - start index +1 = size
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2=mid+1;
        int x =0; // tracker for merged
        for(int i=0;i<arr.length;i++){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        //if any leftover from both arrays add them to merged
        while(idx1<=mid){
            merged[x]=idx1;
            x++;
            idx1++;
        }
        while(idx2<=ei){
            merged[x]=idx2;
            x++;
            idx2++;
        }
        //add these elements to the main array from merged array
        //i in the merged array will be si in the main array
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[si]=merged[i];
        }
    }
    private static void divide(int[] arr, int si, int ei){
        //base case
        if(si>=ei) return;
        int mid = si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid,ei);
        conquer(arr,si,mid,ei);
    }



    public static void main(String[] args) {
        int arr[] = {6,3,5,9,2,8};
        divide(arr,0,arr.length-1);
        for(int a:arr){
            System.out.println(a);
        }
    }
}

