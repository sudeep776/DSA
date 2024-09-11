package Pattern_problems;

public class Full_pyramid {
    public static void main(String[] args) {
        int rows = 4;
        for(int i=0;i<rows;i++){
            //print spaces
            for(int j=i;j<4;j++){
                System.out.print(" ");
            }

            //print stars
            for(int j=0;j<(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //reverse triangle
        for(int i=0;i<4;i++){
            //print spaces
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }

            //print stars
            for(int j=0;j<(rows+1)-(2*i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
