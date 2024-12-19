public class PrintOddSum {
    public static int sum(int[] arr,int i){
        if(i>=arr.length){
            return 0;
        }
        int s=0;
        if(arr[i]%2==1){
            s+=arr[i];
        }
        return s+sum(arr, i+1);
    }
    public static int anothermethod(int[] arr,int i){
        if(i>=arr.length){
            return 0;
        }
        if(arr[i]%2==1){
            return arr[i]+sum(arr,i+1);
        }
        return sum(arr,i+1);
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        System.out.print(sum(arr1, 0)+" ");
        System.out.print(anothermethod(arr1, 0));
    }
}
