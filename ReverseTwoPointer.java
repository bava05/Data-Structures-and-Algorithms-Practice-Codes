import java.util.*;

public class ReverseTwoPointer {
    public static void reversearray(int[] arr){
        int n=arr.length;
        int start=0,end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int length=sc.nextInt();
        int a[]=new int[a.length];
        for(int i=0;i<length;i++){
            a[i]=sc.nextInt();
        }
    }
}
