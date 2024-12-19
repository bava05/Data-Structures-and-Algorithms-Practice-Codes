public class CheckArraySorted {
    public static boolean ArraySort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr1={3,1,2,5};
        System.out.println(ArraySort(arr1));
    }
}
