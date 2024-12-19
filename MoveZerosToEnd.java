public class MoveZerosToEnd {
   public static int movezeros(int[] nums){
    int m=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               int temp=nums[i];
               nums[i]=nums[m];
               nums[m]=temp;
               m++;
           }
           return nums[i];
       }
       return 0;
   }
   public static void main(String[] args){
    int[] arr={1,0,3,0,7};
    System.out.print(movezeros(arr));
   }
}
