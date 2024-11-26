package LL_Arrays;

public class Remove_Duplicates_Sorted_Array {
    private static int removeDuplicates(int arr[]){
        int i=0;
        for(int j=i;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }return i+1;
    }
    public static void main(String[] args) {
        int arr[]= {1,1,2,2,2,3,3};
        int result = removeDuplicates(arr);
        System.out.println(result);
    }
}
