public class TwoPointerApproach {
    public static boolean twoPointerApproach(int[] arr,int target){
        int n=arr.length;
        int start=0,end=n-1;
        while(start<end){
            int current_sum=arr[start]+arr[end];
            if(current_sum==target){
                return true;
            }
            else if(current_sum>target){
                end=end-1;
            }
            else{
                start=start+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[]={3,7,12,15,9};
        System.out.println(twoPointerApproach(arr,16));
    }
}
