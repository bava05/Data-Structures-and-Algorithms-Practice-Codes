public class ZeroArrayProduct {
    public static void product(int[] arr){
        long product=1;
        long[] res=new long[arr.length];
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                product*=arr[i];
            }
            else{
                flag=true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(flag==true){
                if(arr[i]!=0){
                    res[i]=0;
                }
                else{
                    res[i]=product;
                }
            }
            else{
                res[i]=product/arr[i];
            }
            System.out.print(" "+res[i]);
    }
}
    public static void main(String[] args){
        int arr[]={9,0,6,0};
       product(arr);
    }
}

