public class SumOfNnumbers {
    public static int SumNatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static int SumNEfficient(int x){
        int add=(x*(x+1))/2;
        return add;
    }

    public static void main(String[] args){
        System.out.println("The Sum of N natural numbers is "+SumNatural(5));
        System.out.println("The Sum of N natural numbers is "+SumNEfficient(5));
}
}
