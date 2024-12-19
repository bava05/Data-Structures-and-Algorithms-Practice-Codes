public class TwoDArrays {
    public static void Traversal(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args){
        int[][] arr1={
            {1,2,3,4},
            {3,4,5,6}
        };
        Traversal(arr1);
    }
}
