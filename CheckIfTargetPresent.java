public class CheckIfTargetPresent {
    public static int Search(int[] arr,int target,int i,int count){
        if(i>=arr.length){
            return 0;
        }
        if(arr[i]==target){
            count++;
        }
        return Search(arr, target, i+1, count);
    }
    public static void main(String[] args){
        int[] arr1={4,2,4,4,8};
        
        System.out.print(Search(arr1, 4, 0,0));
    }
}
