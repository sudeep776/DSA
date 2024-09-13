package Arrays1;

import java.util.ArrayList;
import java.util.Arrays;

//check if the i,j value in the matrix is zero and mark the row with -1 and col -1
//markRow/markCol - pass the n,m and i values to mark -- for that i value what j col are !=0
//then mark it with -1 and then once all rows are marked -- mark it with 0
public class Set_Matrix_Zeroes_BF {
    private static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
        for(int j=0;j<m;j++){
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    private static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        for(int i=0;i<n;i++){
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix,int n,int m){
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    markRow(matrix,n,m,i);
                    markCol(matrix,n,m,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));

        int n = matrix.size();
        int m = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> result = zeroMatrix(matrix,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(matrix.get(i).get(j));
            }
        }
    }
}
