public class TwoDMatrix {
    public static void swap(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void print2DTranspose(int[][] arr){
       int n=arr.length;
       int m=arr[0].length;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){ 
            swap(arr);
            System.out.print(arr[i][j]);
       }
    }
}
    public static void main(String[] args){
        int[][] arr1={
            {3,2,11},
            {5,6,10},
            {7,8,9}
        };
        print2DTranspose(arr1);
    }
}
