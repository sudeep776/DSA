package Arrays2;

public class Count_inversions {
    public static void count(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        count(arr);
    }
}
