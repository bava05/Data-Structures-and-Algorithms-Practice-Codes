public class FibbonacciSeries {
    public static int fibbonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibbonacci(n-1)+fibbonacci(n-2);
    }
    public static void main(String[] args){
        int n=7;
        System.out.print(fibbonacci(n));
    }
}
