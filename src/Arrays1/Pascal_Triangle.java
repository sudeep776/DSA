package Arrays1;

//row-n col-c  n-1Cr-1
// run a loop i=0 to rows-1  -- res * (n-i-1) / i+1
// 4c2 -- 4 /1 * 3/2 --
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
