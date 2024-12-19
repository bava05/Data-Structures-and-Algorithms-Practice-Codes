public class CheckArrayEqualRecursion {
    public static boolean arrayElements(int[] arr1,int[] arr2,int i){
        if(arr1.length!=arr2.length){
            return false;
        }
        if(i>=arr1.length){
            return true;
        }
        if(arr1[i]!=arr2[i]){
            return false;
        }
        return arrayElements(arr1, arr2, i+1);
        
    }
    public static void main(String[] args){
        int[] a1={1,2,3,4};
        int[] a2={3,5,6,7};
        System.out.print(arrayElements(a1, a2, 0));
    }
}
