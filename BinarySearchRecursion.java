public class BinarySearchRecursion {
    public static int binarysearch(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            return binarysearch(arr,mid+1, end, target);
        }
        return binarysearch(arr,start,mid-1, target);
    }
    public static void main(String[] args){
        int array[]={9,8,10,12,23,45,67};
        int tar=1;
        System.out.println(binarysearch(array,0,array.length-1,tar));
    }
}
