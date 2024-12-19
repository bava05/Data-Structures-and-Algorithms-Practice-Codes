public class PrintOddOfArray {
    public static void printodd(int[] arr,int i){
        if(i>=arr.length){
            return;
        }
        if(arr[i]%2==1){
            System.out.print(arr[i]+" ");
        }
        printodd(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        printodd(arr1, 0);
    }
}
