public class buyandsellproduct {
    public static void maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int min=prices[0];
        int maxproduct=0;
        for(int i=0;i<n;i++){
            if(prices[i]>min){
                profit=prices[i]-min;
                maxproduct=Math.max(maxproduct,profit);
            }
            else{
                min=prices[i];
            }
        }
        System.out.println(maxproduct);
    }
    public static void main(String[] args){
        int[] arr={7,1,5,3,6,4};
        maxProfit(arr);
    }
}
