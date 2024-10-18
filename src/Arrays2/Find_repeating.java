package Arrays2;

public class Find_repeating {
    public static void rep_miss(int arr[]){
        //x is repeating
        long s = 0;
        long s2 =0;
        long n = arr.length;
        //find  sn and s2n
        long sn = (n*(n+1))/2;
        long sn2 = (n*(n+1)*(2*n+1))/6;
        //find s and s2
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            s2+= (long) arr[i] *arr[i];
        }
        //val1 = x-y and val2 = x^2 - y^2
        long val1 = s-sn;
        long val2 = s2-sn2;
        val2 = val2/val1; // val2 here is x+y
        long x = (val2+val1)/2;
        long y = x-val1;
        System.out.println(x + " :repeating" + y +" :missing");
    }
    public static void main(String[] args) {
        int arr[] = {3,1,3,4,2};
        rep_miss(arr);
    }
}
