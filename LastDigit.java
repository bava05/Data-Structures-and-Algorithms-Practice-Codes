public class LastDigit {
    public static void main(String[] args){
        int num=156;
        int revNum=0;
        while(num>0){
        int digit=num%10;
        revNum=(revNum*10)+digit;
        num=num/10;
        }
        System.out.println("Last digit of the number is "+revNum);
    }
}
