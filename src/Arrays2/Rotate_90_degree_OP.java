package Arrays2;

public class Rotate_90_degree_OP {
    public static void rotate(int arr[][]){
        //transpose the matrix
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<arr[i].length;j++){ // start j from i+1 as it will cause reverse swapping example - (0,1) and (1,0)
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse the rows
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<high){
                int temp = arr[i][low];
                arr[i][low]=arr[i][high];
                arr[i][high]=temp;
                low++;
                high--;
            }
        }

        //reverse rows alternative
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n/2;j++){
//                int temp = arr[i][j];
//                arr[i][j]=arr[i][n-i-j];
//                arr[i][n-1-j]=temp;
//            }
//        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
