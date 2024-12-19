public class MaximumElementSlidingWindow {
    public static void kWindow(int[] arr,int k){
        int i=0;
        int j=k-1;
        int max=Integer.MIN_VALUE;
        while(i<arr.length && j<arr.length){
            int sum=0;
            for(int p=i;p<=j;p++){
                sum+=arr[p];
            }
            max=Math.max(max,sum);
            i++;
            j++;
        }
        System.out.print(max+" ");
    }
    public static void main(String[] args){
        int[] arr1={3,-1,2,9,10,11};
        kWindow(arr1, 3);
    }
}
