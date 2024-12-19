import java.util.*;
public class MaxElementOfArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] array=new int[10];
        System.out.println("Enter the elements:");
        for(int i=1;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("The maximum element is "+max);
    }
}
