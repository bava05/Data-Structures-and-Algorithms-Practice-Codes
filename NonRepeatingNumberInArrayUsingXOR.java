public class NonRepeatingNumberInArrayUsingXOR {
    public static void XorElements(int[] arr){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            res=(arr[i]^res);
        }
        System.out.print(res+" ");
    }
    public static void main(String[] args){
        int[] arr1={10,20,10,20,30};
        XorElements(arr1);
    }
}
