public class MissingNumber {
    public static void missingnum(int[] nums){
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
           n+=i-nums[i];
        }
        System.out.println(n);
    }
    public static void main(String[] args){
       int[] arr={3,0,1};
       missingnum(arr); 
    }
}
