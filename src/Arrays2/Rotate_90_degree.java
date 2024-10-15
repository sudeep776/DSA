package Arrays2;

public class Rotate_90_degree {
    public static int[][] rotate(int arr[][]){
        int n = arr.length;
        int result[][] = new int[3][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[j][i]=arr[n-i-1][j];
            }
        }return result;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result[][] = rotate(arr);
        //print the result
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.println(result[i][j]);
            }
        }
    }
}
