package Arrays1;

//row col
public class Pascal_Triangle {
    public static void main(String[] args) {
        int rows = 4;//rows -1 should be take since formula is r-1Cc-1
//        for(int cols=0;cols<3;cols++) {
            int res =1;
            for (int i = 0; i < rows-1; i++) {
                res = res * (rows - i-1);
                res = res / (i + 1);
                System.out.println(res);
            }
//        }
    }
}
