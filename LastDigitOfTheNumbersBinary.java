public class LastDigitOfTheNumbersBinary {
    public static int lastDigit(int num){
        if(num%2==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        int number=7;
        System.out.print(lastDigit(number));
    }
}
