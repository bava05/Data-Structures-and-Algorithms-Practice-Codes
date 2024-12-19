public class AlternateArrayReverse {
    public static void PrintReverse(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=m-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] arr1={
            {1,2,3,4},
            {5,6,7,8}
        };
        PrintReverse(arr1);
    }
}
