public class Search {
public static int search(int[] arr,int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args){
        int array[]={1,23,6,8,34};
        System.out.println(search(array,34));
    }
}
