import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int length=sc.nextInt();
        System.out.println(length);
        int arr[]=new int[length];
        for(int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
            System.out.println("Enter the array:"+arr[i]);
        }
        
    }
}
