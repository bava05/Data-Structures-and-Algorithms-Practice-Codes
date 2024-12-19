public class SumMax {
    public static void printmax(int[] arr,int k){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        
        i=0;
        int j=k;
        while(i<arr.length && j<arr.length){
            sum=sum-arr[i]+arr[j];
            max=Math.max(max,sum);
            i++;
            j++;
        }
        System.out.print(max);
    }
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5,6};
        printmax(arr1, 0);
    }
}
