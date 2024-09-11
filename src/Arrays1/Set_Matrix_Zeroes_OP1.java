package Arrays1;

import java.util.ArrayList;
import java.util.Arrays;


public class Set_Matrix_Zeroes_OP1 {
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix,int n,int m){
        //traverse the matrix but only set the first row and col - inplace
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    //mark ith row
                    matrix.get(i).set(0,0);

                    //mark jth col
                    if(j!=0){
                        matrix.get(0).set(j,0);
                    }
                    else{
                        col0=0;
                    }
                }

            }
        }
        //1 to n-1 m-1
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix.get(i).get(j)!=0){
                    if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0){
                        matrix.get(i).set(j,0);
                    }
                }
            }
        }

        //set the first row and col
        if(matrix.get(0).get(0)==0){
            for(int i=0;i<m;i++){
                matrix.get(0).set(i,0);
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix.get(i).set(0,0);
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1)));

        int n = matrix.size();
        int m = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> result = zeroMatrix(matrix,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(result.get(i).get(j));
            }
        }
    }
}
