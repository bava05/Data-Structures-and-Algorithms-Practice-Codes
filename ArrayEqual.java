public class ArrayEqual {
   public static boolean isEqual(int[] arr1, int[] arr2){
    int n=arr1.length;
    int m=arr2.length;
    if(m!=n){
        return false;
    }
    for(int i=0;i<n;i++){
        if(arr1[i]!=arr2[i]){
            return false;
        }
    }
    return true;
   }
   public static void main(String[] args){
    int[] arr1={1,2,3};
    int[] arr2={1,2,3};
    System.out.println(isEqual(arr1, arr2));
   }
}
