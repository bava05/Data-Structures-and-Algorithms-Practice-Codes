public class ToSum {
    public static boolean twoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            int first=arr[i];
            for(int j=i+1;j<arr.length;j++){
                int second=arr[j];
            if(first+second==target){
                return true;
            }
        }
    }
        return false;
    }
    public static void main(String[] args){
        int arr[]={3,7,12,9,15};
        System.out.println(twoSum(arr,16 ));
    }
}
