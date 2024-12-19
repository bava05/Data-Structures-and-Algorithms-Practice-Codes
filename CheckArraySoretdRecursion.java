public class CheckArraySoretdRecursion {
    public static boolean arraySort(int[] arr,int i){
        int n=arr.length;
        if(i>=n-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return arraySort(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr1={7,8,3,4,5};
        System.out.print(arraySort(arr1, 0));
    }
}
