public class Kadanesalgorithm {
    public static void subarraysum(int[] arr){
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args){
        int[] arr1={3,4,5};
        subarraysum(arr1);
    }
}
