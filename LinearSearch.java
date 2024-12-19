public class LinearSearch {
    public static int TimeComplexity(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,68,9};
        System.out.println(TimeComplexity(arr, 68));
    }
}
