public class LastDigitRecursion {
    public static void printDigits(int n){
        if(n==0){
            return;
        }
        int revNum=0;
        int digit=n%10;
        revNum=(revNum*10)+digit;
        n=n/10;
        System.out.print(revNum);
        printDigits(n);
    }
    public static void main(String[] args){
        int num=512;
        printDigits(num);
    }
}
