package Arrays1;

//when to buy and when to sell
//when to buy - when its min and sell when its max - to attain max Profit
//updating the minimum every iteration
public class Stock_Buy_Sell_OP {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = 0;
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minimum) minimum=arr[i];
            if((arr[i]-minimum)>maxPro) maxPro=arr[i]-minimum;
        }
        System.out.println(maxPro);
    }
}
