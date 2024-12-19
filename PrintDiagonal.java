public class PrintDiagonal {
    public static void diagonalelements(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
                if(j==n-1-i){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] arr1={
            {3,11,12,73},
            {5,10,1,2},
            {6,0,13,14},
            {7,8,15,16}
        };
        diagonalelements(arr1);
    }
}
