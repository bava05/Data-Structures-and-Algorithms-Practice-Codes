public class BinaryToDecimalConversion {
    public static void binaryToDecimal(int[] arr){
        int n=arr.length;
        int decimalValue=0;
        for(int i=0;i<n;i++){
            int power = n - i - 1;
            decimalValue += arr[i] * Math.pow(2, power);
        }
        System.out.print(decimalValue+" ");
    }
    public static void main(String[] args){
        int[] arr1={1,0,1,0,0};
        binaryToDecimal(arr1);
    }
}
