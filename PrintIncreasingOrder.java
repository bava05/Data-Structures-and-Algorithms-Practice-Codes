public class PrintIncreasingOrder {
    public static void printIncreasing(int n){
        if(n==0){
            return ;
    }
    printIncreasing(n-1);
    System.out.print(n+" ");
}
public static void anothermethod(int i,int n){
    if(i>n){
        return ;
    }
    System.out.print(i+" ");
    anothermethod(i+1, n);
}
public static void main(String[] args){
    int element=5;
    printIncreasing(element);
    anothermethod(1, element);
}
}
