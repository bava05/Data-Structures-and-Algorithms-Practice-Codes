public class StairsProblem {
    public static int fun(int n){
        if(n==0 || n==1) return 1;
        if(n%3==0) return 0;
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args){
        int num=7;
        System.out.print(fun(num)+" ");
    }
}
