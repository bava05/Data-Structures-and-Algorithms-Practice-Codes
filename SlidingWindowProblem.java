public class SlidingWindowProblem {
    public static void slidingwindow(int[] arr,int k){
        int n=arr.length;
        int i=0;
        int j=k-1;
        while(i<n && j<n){
            int sum=0;
                for(int p=i;p<=j;p++){
                    sum+=arr[p];
                }
                System.out.print(sum+" ");
                i++;
                j++;
            }
        }
    public static void main(String[] args){
        int[] arr1={3,-1,2,9,10,11};
        slidingwindow(arr1, 3);
    }
}
