public class SearchIn2DArray {
   public static boolean SearchInArray(int[][] arr,int target){
    int n=arr.length;
    int m=arr[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==target){
                return true;
            }
        }
    }
    return false;
   } 
   public static void main(String[] args){
    int[][] arr1={
        {1,2,3,4},
        {9,5,6,7}
    };
    System.out.println(SearchInArray(arr1, 0));
   }
}
