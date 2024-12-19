public class CountOddElements2DArray {
    public static void CountOdd(int[][] arr){
        int count=0;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        System.out.println("The count of odd element is:"+count);
    }
    public static void main(String[] args){
        int[][] arr1={
            {3,0,1,5},
            {6,8,10,12},
            {13,15,18,21},
            {34,37,38,39}
        };
        CountOdd(arr1);
    }
}
