public class BoundaryPrint {
    public static void printboundary(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            if(i==0){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    for(int j=0;j<m;j++){
        if(j==m-1){
            for(int i=1;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    for(int i=0;i<n;i++){
        if(i==n-1){
            for(int j=m-2;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    for(int j=0;j<m;j++){
        if(j==0){
            for(int i=n-2;i>0;i--){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    }
    public static void main(String[] args){
        int[][] arr1={
            {3,0,1,5},
            {6,8,10,12},
            {13,15,18,21},
            {34,37,38,39}
        };
        printboundary(arr1);
    }
}
