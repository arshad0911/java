package patterns;
import java.util.Scanner;
public class AlphaPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        
        while(i<=n){
            int j=1;
            char x=(char)('A'+i-1);
            while(j<=i){
                
               System.out.print(x);
                j++;
               }
            System.out.println();
            i++;
            x++;
        }
    }
}
