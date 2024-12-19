
public class Odd {
    public static void printOdd(int n){
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void PrintOdd(int n){
        for(int i=1;i<n;i=i+2){
            System.out.println("Efficient method: "+i);
        }
    }
    public static void main(String[] args){
        int n=10;
        printOdd(n);
        PrintOdd(n);
    }    
}
