public class TimeComplexity {
    public static void main(String[] args){
    /*int n=5;
    int count=0;
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
            for(int k=j;k<=n;k++){
                System.out.println("HELLO");
                count++;
                System.out.println(count);
            }
        } 
    }*/
    timeComplexity(100);
}
public static void timeComplexity(int n){
    //int sum=100;
    System.out.println("N= "+n);
    while(n>0){
        System.out.println("Hello");
        n/=10;
    }        
}
}
