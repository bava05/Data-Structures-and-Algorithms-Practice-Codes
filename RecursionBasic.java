public class RecursionBasic {
    public static void printelements(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printelements(n-1);
    }
    public static void main(String[] args){
        int element=5;
        printelements(element);
    }
}
