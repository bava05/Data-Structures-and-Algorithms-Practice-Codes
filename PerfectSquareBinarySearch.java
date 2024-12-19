public class PerfectSquareBinarySearch {
    public static boolean binarysearchperfect(int n){
        int start=1,end=n/2;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid*mid==n){
                return true;
            }
            else if(n<mid*mid){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(binarysearchperfect(0));
    }
}
