public class SumOfArray {
    public static int printSum(int[] arr,int i){
        if(i>=arr.length){
            return 0;
        }
        return arr[i]+printSum(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        System.out.print(printSum(arr1, 0)+" ");
    }
}
