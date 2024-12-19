public class PrintElemetsOfArray {
    public static void arrayelements(int[] arr,int i){
      if(i>=arr.length){
            return ;
        }
        System.out.print(arr[i]+" ");
        arrayelements(arr,i+1);
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        arrayelements(arr1,0);
    }
}
