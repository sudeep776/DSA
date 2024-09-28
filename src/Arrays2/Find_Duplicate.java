package Arrays2;

public class Find_Duplicate{
    public static int findDuplicate(int arr[]){
        int slow = arr[0];
        int fast = arr[0];
        while(true){
            slow=arr[slow];
            fast=arr[arr[fast]];

        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,3,4,2};

    }
}