public class PrintOdd {
    public static void printodd(int i,int n){
        if(i>n){
            return ;
        }
        System.out.print(i+" ");
        printodd(i+2,n);
    }
    public static void main(String[] args){
        int number=7;
        printodd(1,number);
    }
}
