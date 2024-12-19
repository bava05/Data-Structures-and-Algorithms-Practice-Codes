public class BinarySearch {
    public static boolean binarysearch(int[] arr,int n,int target){
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return true;
            }
            else {
                if(target<arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        }
        return false;
    }
    public static void main(String[] args){
        int array[]={9,8,10,12,23,45,67};
        int n=array.length;
        int tar=67;
        System.out.println(binarysearch(array,n,tar));
    }
}
