public class SubArraySumEfficient {
    public static void subarray(int[] arr){
        int n=arr.length;
        int[] aux=new int[n];
        aux[0]=arr[0];
        for(int i=1;i<n;i++){
            aux[i]=arr[i]+aux[i-1];
        }
        int sum=0;
        int maxSum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=aux[j]-aux[i]+arr[i];
            }
            maxSum=Math.max(sum,maxSum);
        }
        System.out.println(maxSum+" ");
    }
    public static void main(String[] args){
        int[] arr={3,4,5};
        subarray(arr);
    }
}
