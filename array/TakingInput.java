package array;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter element at "+i+"th index");
            arr[i]=s.nextInt();
        }
        System.out.println("Your array is:");
        for(int i=0;i<n;i++){
            
            System.out.println(arr[i]);
        }
    }
}
