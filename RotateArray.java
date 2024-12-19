public class RotateArray {
    public static int[] rotate(int[] arr){
        int temp=arr[0];
        int n=arr.length-1;
        for(int i=1;i<=n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        System.out.println(rotate(arr));
    }
}
