package Arrays1;

//brute_force - to be done using recursion playlist from Strivers

//find pivot element -- then swap with it and reverse the rest of the array from index
public class Next_Permutation {
    public static void swap(int a,int b,int arr[]){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        //find the pivot
        int index=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                index=i;
                break;
            }
        }
        //now find the next greater element
        for(int i=arr.length-1;i>=index;i--){
            if(arr[i]>arr[index]){
                swap(i,index,arr);
                break;
            }
        }
        //reverse the rest of the array from the pivot
        int low = index+1;
        int high=arr.length-1;
        while(low<high){
            swap(low,high,arr);
            low++;
            high--;
        }
        //print the array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
