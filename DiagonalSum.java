public class DiagonalSum {
    public static void diagonal(int[][] arr){
        int n=arr.length;
        int diagonalsum=0;
        for(int i=0;i<n;i++){
            diagonalsum+=arr[i][i];
            if(i!=(n-1-i)){
                diagonalsum+=arr[i][n-1-i];
            }
        }
        System.out.print(diagonalsum);
    }
    public static void main(String[] args){
        int[][] arr1={
            {3,11,12,73},
            {5,10,1,2},
            {6,0,13,14},
            {7,8,15,16}
        };
        diagonal(arr1);
    }
}
