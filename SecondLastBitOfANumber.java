public class SecondLastBitOfANumber {
    public static void main(String[] args){
        int num=13;
        //Second last bit
        int res=(num>>1)&1;
        System.out.print(res+" ");
        //Third last bit
        int res1=(num>>2)&1;
        System.out.print(res1+" ");
    }
}
