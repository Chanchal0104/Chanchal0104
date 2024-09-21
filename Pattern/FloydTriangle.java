
import java.util.Scanner;

public class FloydTriangle{
    public static void main(String[] args) {
        int i, j, n;
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = 1;
        for(i = 0;i< n;i++){
            for(j=0;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println(" ");
        }

    }
}