public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int[] tempArr=new int[arr.length];
    int k=0;
        for(int i=arr.length-1;i>=0;i--){
            tempArr[k]=arr[i];
            k++;
        } 
        return tempArr;
    }
   public static void main(String[] args){
    int arr[]={1,2,3,4};
   System.out.println(reverseArray(arr));
}
}
