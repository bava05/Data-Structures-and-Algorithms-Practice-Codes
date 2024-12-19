public class SubArray {
    public static void subarray(int[] arr){
        int maxSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                maxSum=Math.max(maxSum,sum);
            }
        }
        System.out.print(maxSum+" ");
    }
    public static void main(String[] args){
        int[] array={3,4,5};
        subarray(array);
    }
}
