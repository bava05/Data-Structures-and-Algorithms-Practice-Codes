public class PerfectSquare {
    public static boolean perfectsquare(int n){
        if(n<0){
            return false;
        }
        for(int i=1;i<n/2;i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int n=9;
        System.out.println(perfectsquare(n));
    }
}
