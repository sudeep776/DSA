package Arrays2;

import java.util.Arrays;

public class Sort_2arrays {
    public static void sort(int arr1[],int arr2[]){
        //trackers for 1st and 2nd array
        int n = arr1.length;
        int m = arr2.length;
        int left = n-1;
        int right = 0;
        //swap the smaller elements to left and bigger to right
        while(left>=0 && right<m){
            if(arr1[left]>arr2[right]){
                int temp = arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        int arr1[] = {1,4,7,10};
        int arr2[] = {2,6,9};
        sort(arr1,arr2);
        for(int a:arr1){
            System.out.println(a);
        }
        for(int b:arr2){
            System.out.println(b);
        }
    }
}
