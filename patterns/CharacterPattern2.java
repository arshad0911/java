package patterns;
import java.util.Scanner;
public class CharacterPattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char p=(char)('A'+i-1);
            while(j<=n){
                System.out.print(p);
                j++;
                p=(char)(p+1);
            }
            System.out.println();
            i++;
        }
    }
}
